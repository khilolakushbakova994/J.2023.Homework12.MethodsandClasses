public class Author {
    private final String danBrown;

    public Author(String danBrown) {
        this.danBrown = danBrown;

    }

    public  String getDanBrown(){
        return danBrown();
    }
    public String toString () {
        return " Имя писателя  " + danBrown;
    }
}