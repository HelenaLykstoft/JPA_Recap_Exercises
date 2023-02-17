package Persistence;

import entities.Book;
import entities.Borrower;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Set;

public class LibraryFacade implements Interface{
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public LibraryFacade(EntityManagerFactory emf ){
        this.emf = emf;
    }

    public Borrower createBorrower(Borrower borrower){
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(borrower);
            em.getTransaction().commit();
        } finally{
            em.close();
        }
        return borrower;
    }

    public static void main(String[] args) {
        LibraryFacade facade = new LibraryFacade(emf);
        Borrower borrower = new Borrower("2010","Helena",java.time.LocalDate.now(),"Kaas alle 29");
        Borrower b = facade.createBorrower(borrower);
        System.out.println(b);
    }

    @Override
    public Set<Borrower> getAllBorrowers() {
        return null;
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        return null;
    }

    @Override
    public Set<Book> getBooksByLibrary(Long libraryId) {
        return null;
    }

    @Override
    public Borrower updateBorrower(Borrower borrower) {
        return null;
    }

    @Override
    public Book deleteBook(Long bookId) {
        return null;
    }

    @Override
    public Set<Book> getAllBooksByBorrower(Long borrowerId) {
        return null;
    }

    @Override
    public Set<Book> getOverDueBooks(Long borrowerId) {
        return null;
    }
}
