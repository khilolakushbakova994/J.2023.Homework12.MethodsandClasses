public class Book {
    private final String bookName;
    private int publishingYear;
    private final Author danBrown;


    public Book(String bookName,Author danBrown, int publishingYear) {
        this.bookName = bookName;
        this.danBrown = danBrown;
        this.publishingYear = publishingYear;


    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear() {
        this.publishingYear =2022;

    }
}
