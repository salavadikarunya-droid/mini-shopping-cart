import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        System.out.println("================================");
        System.out.println("       MINI SHOPPING CART");
        System.out.println("================================");

        System.out.print("How many products do you want to add? ");
        int numberOfProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfProducts; i++) {

            System.out.println("\nProduct " + (i + 1));

            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            products.add(productName);
            prices.add(price);
            quantities.add(quantity);
        }

        System.out.println("\n================================");
        System.out.println("             YOUR CART");
        System.out.println("================================");

        double grandTotal = 0;

        for (int i = 0; i < products.size(); i++) {

            double total = prices.get(i) * quantities.get(i);

            grandTotal += total;

            System.out.println("\nProduct  : " + products.get(i));
            System.out.println("Price    : Rs." + prices.get(i));
            System.out.println("Quantity : " + quantities.get(i));
            System.out.println("Total    : Rs." + total);
        }

        System.out.println("\n================================");
        System.out.println("Grand Total : Rs." + grandTotal);
        System.out.println("================================");

        sc.close();
    }
}