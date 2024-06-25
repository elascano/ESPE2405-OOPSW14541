
package exam;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */

public class Exam {
    private static final String FILE_PATH = "products.json";
    private ArrayList<Product> products;

    public Exam() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void saveProductsToFile() throws IOException {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(products, writer);
        }
    }

    public void loadProductsFromFile() throws IOException {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type productListType = new TypeToken<ArrayList<Product>>(){}.getType();
            products = gson.fromJson(reader, productListType);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public static void main(String[] args) {
        Exam manager = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Category: ");
        String category = scanner.nextLine();

        Product product = new Product(id, name, price, category);
        manager.addProduct(product);

        try {
            manager.saveProductsToFile();
            System.out.println("Product saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            manager.loadProductsFromFile();
            System.out.println("Loaded products from file:");
            for (Product p : manager.getProducts()) {
                System.out.println(p.getId() + ": " + p.getName() + " - " + p.getPrice() + " - " + p.getCategory());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
