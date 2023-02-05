import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double total = 0;
        System.out.println("------------------------------------------");
        System.out.println("Welcome to Food Ordering System");
        System.out.println("------------------------------------------");
        System.out.println("1. Pizza - Rs100");
        System.out.println("2. Burger - Rs150");
        System.out.println("3. Pasta - Rs400");
        System.out.println("4. Salad - Rs200");
        System.out.println("5. Quit");
        System.out.println("------------------------------------------");
        System.out.print("Enter your choice (1-5): ");
        choice = input.nextInt();

        while (choice != 5) {
            switch (choice) {
                case 1 -> total += 100;
                case 2 -> total += 150;
                case 3 -> total += 400;
                case 4 -> total += 200;
                default -> System.out.println("Invalid choice.");
            }
            System.out.println("1. Pizza - Rs100");
            System.out.println("2. Burger - Rs150");
            System.out.println("3. Pasta - Rs400");
            System.out.println("4. Salad - Rs200");
            System.out.println("5. Quit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice (1-5): ");
            choice = input.nextInt();
        }
        System.out.println("Total: Rs" + total);
    }
}
