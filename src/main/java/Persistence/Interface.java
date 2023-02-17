package Persistence;

import entities.Book;
import entities.Borrower;

import java.util.Set;

public interface Interface {
    Set<Borrower> getAllBorrowers();
    Borrower getBorrowerById(Long id);
    Set<Book> getBooksByLibrary(Long libraryId);
    Borrower updateBorrower(Borrower borrower);
    Book deleteBook(Long bookId);
    Set<Book> getAllBooksByBorrower(Long borrowerId);
    Set<Book> getOverDueBooks(Long borrowerId);

}
