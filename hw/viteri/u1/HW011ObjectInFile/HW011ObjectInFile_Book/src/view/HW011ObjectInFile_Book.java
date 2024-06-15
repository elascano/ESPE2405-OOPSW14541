/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;
import model.Book;
import FileSaver.FileSaver;
/**
 *
 * @author Alexis Viteri DCO-ESPE
 */
public class HW011ObjectInFile_Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float totalPrice;
        Book book;
        String dataBooks;
        book=new Book(1, "Julio Cortazar", "Rayuela", "Novela", 30.0F);
        System.out.println("book=============>"+book);
        FileSaver.save(book, "Books.json");
        dataBooks = FileSaver.load("Books.json");
    }
    
}
