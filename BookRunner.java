import java.util.ArrayList;
import java.util.Collections;
/**
 * Tester for  Book class
 */
public class BookRunner
{
    public static void main(String[] args)
    {
        ArrayList<Book> inventory = new ArrayList<>();
        inventory.add(new Book("Hamlet", "play"));
        inventory.add(new Book("Beekeeper's Apprentice", "mystery"));
        inventory.add(new Book("Big Java", "non-fiction"));
        inventory.add(new Book("Beekeeper's Apprentice", "mystery"));
        inventory.add(new Book("Bad Business", "mystery"));
        inventory.add(new Book("Violet the Pilot","juvenile fiction" ));

        Collections.sort(inventory);
        for (Book b: inventory)
        {
            System.out.printf("%-18s%s%n",b.getGenre(), b.getTitle());              
        }
    }
}