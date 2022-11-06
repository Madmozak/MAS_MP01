import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Biblioteka{
    public static void main(String args[]){
        

        //trwałość i extensja classy Bookcase
        try {
            var out = new ObjectOutputStream(new FileOutputStream("extentFile.txt"));
            Bookcase.writeExtent(out);
            out.close();

            var in = new ObjectInputStream(new FileInputStream("extentFile.txt"));
            Bookcase.readExtent(in);
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }


        Library lib = new Library();
        Bookcase bkcase = new Bookcase();
        //atrybut złożony
        lib.addBookcaseToLibrary(bkcase);

        
        Book bk = new Book("Witcher", "Sapkowski", 36234696);
        //atrybut opcjonalny
        bk.setGatunek("fantazy");

        Book bk1 = new Book();
        Book bk2 = new Book();

        //astrybut powtarzalny
        bkcase.addBook(bk2);
        bkcase.addBook(bk1);

        //atrybut klasowy
        System.out.println(bkcase.booksInBookcase);
        
        //metoda klasowa
        System.out.println(Library.maxNumberOfBooksInEntireLibrary());

        //atrybut pochodny
        System.out.println(bkcase.numberOfBooksInBookcase());

        //Przeciążenie
        bkcase.findBooks("Witcher");
        bkcase.findBooks(7645);

        Librarian lb = new Librarian();
        Assistant as = new Assistant();

        //Przesłonięcie
        System.out.println(lb.getSalary());
        System.out.println(as.getSalary());
    }
}