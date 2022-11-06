import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    private static ArrayList<Library> libraryExtent = new ArrayList<Library>();

    //atrybut złożony
    Bookcase bookcase;

    public void addBookcaseToLibrary(Bookcase bookcase){
        this.bookcase = bookcase;
    }

    public static int numberOfBookcasesInLibrary = 2;
    
    //metoda klasowa
    public static int maxNumberOfBooksInEntireLibrary(){
        return Bookcase.maxNumberOfBooksInBookcase * numberOfBookcasesInLibrary;
    }
 

    private static void addLibrary(Library library){
        libraryExtent.add(library);
    }

    private static void removeLibrary(Library library){
        libraryExtent.remove(library);
    }
    
    public static void showExtent() {
 
        System.out.println("Extent of the class: " + Library.class.getName());
 
        for (Library library : libraryExtent) {
            System.out.println(library);
        }
    }            


}
