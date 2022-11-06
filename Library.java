import java.util.ArrayList;

public class Library {
    private static ArrayList<Library> libraryExtent = new ArrayList<Library>();

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
