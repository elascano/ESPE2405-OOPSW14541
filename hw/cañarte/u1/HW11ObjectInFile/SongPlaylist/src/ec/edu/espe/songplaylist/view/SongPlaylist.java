package ec.edu.espe.songplaylist.view;

import ec.edu.espe.songplaylist.model.Song;
import ObjectLib.ObjectManager;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class SongPlaylist {
    
    public static void main(String[] args) throws IOException, ParseException {
        addSong();
        displaySongs();
    }

    private static void addSong() throws IOException, ParseException {
        Scanner input = new Scanner(System.in);
        String addAnotherSong;

        do {
            System.out.print("Title: ");
            String title = input.nextLine();

            System.out.print("Artist: ");
            String artist = input.nextLine();

            System.out.print("Duration: ");
            float duration = input.nextFloat();
            input.nextLine();  // Consume newline left-over

            System.out.print("Musical Gender: ");
            String musicalGender = input.nextLine();

            System.out.print("Release date (dd/mm/yyyy): ");
            String releaseDate = input.nextLine();

            Song song = new Song(title, artist, duration, musicalGender, releaseDate);
            ObjectManager.saveObject(song, "songs");
            
            System.out.print("Do you want to add another song? (y/n): ");
            addAnotherSong = input.nextLine();
        } while (addAnotherSong.equalsIgnoreCase("y"));
    }

    private static void displaySongs() throws IOException {
        List<Object> songs = ObjectManager.loadObject("songs");

        System.out.println("Songs in the playlist:");
        for (Object obj : songs) {
            if (obj instanceof Song song) {
                System.out.println(song);
            }
        }
    }

}

