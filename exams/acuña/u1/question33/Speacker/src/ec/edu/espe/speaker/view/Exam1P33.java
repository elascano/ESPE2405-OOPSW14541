package ec.edu.espe.speaker.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.speaker.model.Speaker;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marcelo Acuña, LogicLegion, DCCO-ESPE 
 *
 */

public class Exam1P33 {
    public static void main(String[] args) {
        ArrayList<Speaker> speakers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            Speaker speaker = new Speaker(0, "", "", "");
            System.out.println("Speaker's ID " + (i + 1) + ": ");
            while (true) {
                try {
                    speaker.setId(scanner.nextInt());
                    scanner.nextLine(); 
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error. You introduced wrong data. ID should be a number. Try again: ");
                    scanner.nextLine(); 
                }
            }

            System.out.println("Speaker's Name " + (i + 1) + ": ");
            while (true) {
                try {
                    speaker.setName(scanner.nextLine());
                    if (speaker.getName().trim().isEmpty()) {
                        throw new IllegalArgumentException("Name cannot be empty. Try again:");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Speaker's Topic " + (i + 1) + ": ");
            while (true) {
                try {
                    speaker.setTopic(scanner.nextLine());
                    if (speaker.getTopic().trim().isEmpty()) {
                        throw new IllegalArgumentException("Topic cannot be empty. Try again:");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("Speaker's Nationality " + (i + 1) + ": ");
            while (true) {
                try {
                    speaker.setNationality(scanner.nextLine());
                    if (speaker.getNationality().trim().isEmpty()) {
                        throw new IllegalArgumentException("Nationality cannot be empty. Try again:");
                    }
                    System.out.println();
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            speakers.add(speaker);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("speakers.json", true))) {
            for (Speaker speaker : speakers) {
                String data = gson.toJson(speaker);
                writer.write(data);
                writer.newLine();
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error in saving data: " + e.getMessage());
        }
    }
}
