import java.util.ArrayList;

public class Bookcase {
    
    private static ArrayList<Bookcase> bookcaseExtent = new ArrayList<Bookcase>();

    private static void addBookcase(Bookcase bookcase){
        bookcaseExtent.add(bookcase);
    }

    private static void removeBookcase(Bookcase bookcase){
        bookcaseExtent.remove(bookcase);
    }

    public static void showExtent() {
 
        System.out.println("Extent of the class: " + Bookcase.class.getName());
 
        for (Bookcase bookcase : bookcaseExtent) {
            System.out.println(bookcase);
        }
    }            
}
