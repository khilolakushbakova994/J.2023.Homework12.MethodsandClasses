public class Main {
    public static void main(String args[]) {

        Book book1 = new Book(" The Da Vinci Code ", "Dan Brawn", 2003);
        System.out.println(book1.getBookName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.setPublishingYear(2022));


        Book book2 = new Book("The Minds of Billy Milligan", "Daniel Keyes", 1995);
        System.out.println(book2.getBookName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPublishingYear());


        Author author1 = new Author("Lev Tolstoy");
        System.out.println(author1.getNameSurname());


        Author author2 = new Author("Jean Christophe Grange");
        System.out.println(author2.getNameSurname());


    }


}


