/**
 * Book has a title and genre (the kind of book it is) and are ordered by genre in alphabetical order
 * 
 * @author Michelle Pham 
 * @version Nov 19, 2016 / Draft
 */
public class Book implements Comparable
{
    private String bookTitle;
    private String bookGenre;

    /**
     * Constructs a book with it's title and genre
     * @param bookTitle the title of the book
     * @param bookGenre the genre of the book
     */
    public Book(String title, String genre)
    {
        bookTitle = title;
        bookGenre = genre;
    }

    /**
     * Gets the book's title
     * @return the title of the book
     */
    public String getTitle()
    {
        return bookTitle;
    }
    
    /**
     * Gets the book's genre
     * @return the genre of the book
     */
    public String getGenre()
    {
        return bookGenre;
    } 
    
    /**
     * Compares if two books have the same genre, then they are ordered alphabetically by the title of the book
     * @param o the title and the genre of the book in order
     * @return 0 the genre being compared to and then being alphabetically organized according to the title of the book
     */
    public int compareTo(Object o)
    {
        Book that = (Book)o;
        if (this.getGenre().compareTo(that.getGenre()) < 0)
        {
            return -1;
        }
        else if (this.getGenre().compareTo(that.getGenre()) > 0)
        {
            return 1;
        }
        else if (this.getTitle().compareTo(that.getTitle()) < 0)
        {
            return -1;
        }
        else if (this.getTitle().compareTo(that.getTitle()) > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
