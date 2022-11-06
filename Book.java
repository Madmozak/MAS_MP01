import java.util.ArrayList;

public class Book {
    
    private static ArrayList<Book> bookExtent = new ArrayList<Book>();

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
