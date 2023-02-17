package Persistence;

import entities.Book;
import entities.Borrower;

import java.util.Set;

public class Facade implements Interface{
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
