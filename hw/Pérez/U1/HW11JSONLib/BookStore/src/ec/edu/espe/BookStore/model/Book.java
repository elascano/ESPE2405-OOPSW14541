
package ec.edu.espe.BookStore.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private int pageCount;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + ", genre=" + genre + ", pageCount=" + pageCount + '}';
    }

    public Book(String title, String author, int publicationYear, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publicationYear
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * @param publicationYear the publicationYear to set
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the pageCount
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
}
