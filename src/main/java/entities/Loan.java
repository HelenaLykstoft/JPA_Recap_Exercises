package entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "loan", indexes = {
        @Index(name = "fk_loan_book1_idx", columnList = "book_ISBN"),
        @Index(name = "fk_loan_borrower1_idx", columnList = "borrower_borrower_id")
})
public class Loan {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "start_date", nullable = false)
    private Instant startDate;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Lob
    @Column(name = "type", nullable = false)
    private String type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "borrower_borrower_id", nullable = false)
    private Borrower borrowerBorrower;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_ISBN", nullable = false)
    private Book bookIsbn;

    @Column(name = "returned")
    private Integer returned;

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public Book getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(Book bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public Borrower getBorrowerBorrower() {
        return borrowerBorrower;
    }

    public void setBorrowerBorrower(Borrower borrowerBorrower) {
        this.borrowerBorrower = borrowerBorrower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}