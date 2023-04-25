import org.w3c.dom.html.HTMLAppletElement;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchInventory {
    static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory =
                new ArrayList<Product>();

        Product product1 = new Product(32, "Apple", 1.50f);
        Product product2 = new Product(33, "banana", 2.00f);
        Product product3 = new Product(34, "grapes", 3.00f);
        Product product4 = new Product(35, "orange", 1.00f);
        Product product5 = new Product(36, "Lemon", 3.00f);

        // and its details are not shown
        return inventory;
    }
}

