interface Issueable {
    void issueBook(Book book) throws BookNotAvailableException;
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId()       { return bookId; }
    public String getTitle()     { return title; }
    public String getAuthor()    { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean status) { this.isAvailable = status; }

    @Override
    public String toString() {
        return "Book[ID=" + bookId + ", Title=" + title + ", Author=" + author + ", Available=" + isAvailable + "]";
    }
}

class Member implements Issueable {
    private int memberId;
    private String name;
    private String email;

    Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public int getMemberId()   { return memberId; }
    public String getName()    { return name; }
    public String getEmail()   { return email; }

    @Override
    public void issueBook(Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException(
                "Book '" + book.getTitle() + "' is not available right now."
            );
        }
        book.setAvailable(false);
        System.out.println("  Book Issued   : " + book.getTitle());
        System.out.println("  Issued To     : " + name);
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("  Book Returned : " + book.getTitle());
        System.out.println("  Returned By   : " + name);
    }

    @Override
    public String toString() {
        return "Member[ID=" + memberId + ", Name=" + name + ", Email=" + email + "]";
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("        LIBRARY MANAGEMENT SYSTEM           ");
        System.out.println("============================================");

        System.out.println("\n>> 1. Creating Books:");
        Book b1 = new Book(1001, "Java Programming", "James Gosling");
        Book b2 = new Book(1002, "Data Structures", "Mark Allen");
        Book b3 = new Book(1003, "Operating Systems", "Silberschatz");
        System.out.println("  " + b1);
        System.out.println("  " + b2);
        System.out.println("  " + b3);

        System.out.println("\n>> 2. Creating Members:");
        Member m1 = new Member(201, "Ravi Kumar", "ravi@gmail.com");
        Member m2 = new Member(202, "Priya Sharma", "priya@gmail.com");
        System.out.println("  " + m1);
        System.out.println("  " + m2);

        System.out.println("\n>> 3. Issuing Book (Success):");
        try {
            m1.issueBook(b1);
        } catch (BookNotAvailableException e) {
            System.out.println("  [Exception] " + e.getMessage());
        }

        System.out.println("\n>> 4. Issuing Same Book Again (Exception):");
        try {
            m2.issueBook(b1);
        } catch (BookNotAvailableException e) {
            System.out.println("  [Exception Caught] " + e.getMessage());
        }

        System.out.println("\n>> 5. Returning Book:");
        m1.returnBook(b1);

        System.out.println("\n>> 6. Issuing Returned Book to Another Member:");
        try {
            m2.issueBook(b1);
        } catch (BookNotAvailableException e) {
            System.out.println("  [Exception] " + e.getMessage());
        }

        System.out.println("\n>> 7. Issuing Another Book:");
        try {
            m1.issueBook(b2);
        } catch (BookNotAvailableException e) {
            System.out.println("  [Exception] " + e.getMessage());
        }

        System.out.println("\n>> 8. Book Status:");
        System.out.println("  " + b1);
        System.out.println("  " + b2);
        System.out.println("  " + b3);

        System.out.println("\n============================================");
        System.out.println("          Program Completed!                ");
        System.out.println("============================================");
    }
}