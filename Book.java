import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable{
    
    private static ArrayList<Book> bookExtent = new ArrayList<Book>();

    
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String authorName;
    private int ISBN;
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    //atrybut opcjonalny
    private String gatunek;

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Book(){

    }

    

    public Book(String name, String authorName, int ISBN){
        this.name = name;
        this.authorName = authorName;
        this.ISBN = ISBN;

    }

    public String toString(){
        return "Book " + name + "\n"
        + "Author " + authorName + "\n"
        + "Gatunek " + gatunek + "\n"
        + "ISBN " + ISBN;
    }

    private static void addBook(Book book){
        bookExtent.add(book);
    }

    private static void removeBook(Book book){
        bookExtent.remove(book);
    }

    public static void showExtent() {
 
        System.out.println("Extent of the class: " + Book.class.getName());
 
        for (Book book : bookExtent) {
            System.out.println(book);
        }
    }            
}
