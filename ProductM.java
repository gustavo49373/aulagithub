import java.util.Scanner;
import java.util.Locale;
public class ProductM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        

        Product product = new Product(name, price, quantity);
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", product.getName(), price, quantity, product.totalValueInStock());
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int q2 = sc.nextInt();
        product.addProducts(q2);
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", product.getName(), price, product.getQuantity(), product.totalValueInStock());
        System.out.print("\nEnter the number of products to be removed in stock: ");
        int q3 = sc.nextInt();
        product.removeProducts(q3);
        
        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", product.getName(), price, product.getQuantity(), product.totalValueInStock());
        sc.close();
    }
    
}
