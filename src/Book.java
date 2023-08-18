public class Book {

    private final String bookName;
    private final String author;
    private int publishingYear;


    public Book (String bookName, String author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear =publishingYear;

    }

    String getBookName (){
        return bookName;
    }
    String getAuthor(){
        return author;
    }
    public int getPublishingYear(){
        return publishingYear;
    }

    public int setPublishingYear(int i) {
        i= 2022;
        return i;
    }
}
