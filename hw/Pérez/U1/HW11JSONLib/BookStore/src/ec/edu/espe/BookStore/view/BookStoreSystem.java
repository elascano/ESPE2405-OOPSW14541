package ec.edu.espe.BookStore.view;

import ec.edu.espe.BookStore.model.Book;
import ec.edu.espe.JsonLib.model.JsonHandler;
import java.util.List;

public class BookStoreSystem {
    public static void main(String[] args){
        JsonHandler<Book> jsonHandler = new JsonHandler<>("Books.json", Book.class);


        Book book = new Book("La mecanica del corazon", "Mathias Malzieu", 2007, "Lovex", 176);


        jsonHandler.addObject(book);

        List<Book> books = jsonHandler.readJson();

        System.out.println("Books in the store:");
        for (Book storedBook : books) {
            System.out.println(storedBook);
        }
    }
}
