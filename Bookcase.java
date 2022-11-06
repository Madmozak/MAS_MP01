import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Bookcase implements Serializable{
    //extensja
    private static ArrayList<Bookcase> bookcaseExtent = new ArrayList<Bookcase>();

    //atrybut klasowy
    public static int numberOfBooksInBookcase;
    public static int maxNumberOfBooksInBookcase = 99;

    private static void addBookcase(Bookcase bookcase){
        bookcaseExtent.add(bookcase);
    }

    private static void removeBookcase(Bookcase bookcase){
        bookcaseExtent.remove(bookcase);
    }
    //atrybut pochodny
    public int numberOfBooksInBookcase(){
        return booksInBookcase.size();
    }


    public static void showExtent() {
 
        System.out.println("Extent of the class: " + Bookcase.class.getName());
 
        for (Bookcase bookcase : bookcaseExtent) {
            System.out.println(bookcase);
        }
    }
    //Przeciązenie
    public ArrayList<Book> findBooks(String name){
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : booksInBookcase) {
            if(book.getName() == name)
                booksFound.add(book);
        }
        return booksFound;
    }

    public ArrayList<Book> findBooks(int isbn){
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : booksInBookcase) {
            if(book.getISBN() == isbn)
                booksFound.add(book);
        }
        return booksFound;
    }



    //atrybut powtarzalny
    public ArrayList<Book> booksInBookcase = new ArrayList<Book>();

    public void addBook(Book book){
        booksInBookcase.add(book);
        numberOfBooksInBookcase=+1;
    }

    public void removeBook(Book book){
        booksInBookcase.remove(book);
        numberOfBooksInBookcase=-1;
    }

    //trwałość extensji
    public static void writeExtent(ObjectOutputStream oos) throws IOException {
        oos.writeObject(bookcaseExtent);
    }

    public static void readExtent(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        bookcaseExtent = (ArrayList<Bookcase>)ois.readObject();
    }



}
