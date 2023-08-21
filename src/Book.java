public class Book {

    private final String bookName;
    private int publishingYear;
    private Author danBrown;


    public Book(String bookName, int publishingYear, Author danBrown) {
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

    public String toString() {
        return "Название книги  " + bookName + " " + "Год выпуска книги   " + publishingYear;
    }
}
