
package ec.edu.espe.songplaylist.model;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Song implements Serializable {
    private String title;
    private String artist;
    private float duration;
    private String musicalGender;
    private String releaseDate;

    public Song(String title, String artist, float duration, String musicalGender, String releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.musicalGender = musicalGender;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", duration=" + duration + ", musicalGender=" + musicalGender + ", releaseDate=" + releaseDate + '}';
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
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @return the duration
     */
    public float getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * @return the musicalGender
     */
    public String getMusicalGender() {
        return musicalGender;
    }

    /**
     * @param musicalGender the musicalGender to set
     */
    public void setMusicalGender(String musicalGender) {
        this.musicalGender = musicalGender;
    }

    /**
     * @return the releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    


}
