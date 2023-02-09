import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double total = 0;
        ArrayList<String> orderList = new ArrayList<>();
        System.out.println("------------------------------------------");
        System.out.println("Welcome to Food Ordering System");
        System.out.println("------------------------------------------");
        System.out.println("1. Pizza - Rs100");
        System.out.println("2. Burger - Rs150");
        System.out.println("3. Pasta - Rs400");
        System.out.println("4. Salad - Rs200");
        System.out.println("5. View Order List");
        System.out.println("6. Cancel Order");
        System.out.println("7. Quit");
        System.out.println("------------------------------------------");
        System.out.print("Enter your choice (1-7): ");
        choice = input.nextInt();

        while (choice != 7) {
            switch (choice) {
                case 1:
                    orderList.add("Pizza");
                    total += 100;
                    break;
                case 2:
                    orderList.add("Burger");
                    total += 150;
                    break;
                case 3:
                    orderList.add("Pasta");
                    total += 400;
                    break;
                case 4:
                    orderList.add("Salad");
                    total += 200;
                    break;
                case 5:
                    System.out.println("Order List:");
                    for (int i = 0; i < orderList.size(); i++) {
                        System.out.println((i + 1) + ". " + orderList.get(i));
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Enter the item number to cancel:");
                    int itemNum = input.nextInt();
                    if (itemNum > 0 && itemNum <= orderList.size()) {
                        String item = orderList.remove(itemNum - 1);
                        switch (item) {
                            case "Pizza" -> total -= 100;
                            case "Burger" -> total -= 150;
                            case "Pasta" -> total -= 400;
                            case "Salad" -> total -= 200;
                        }
                        System.out.println("Item " + item + " has been successfully cancelled.");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("1. Pizza - Rs100");
            System.out.println("2. Burger - Rs150");
            System.out.println("3. Pasta - Rs400");
            System.out.println("4. Salad - Rs200");
            System.out.println("5. View Order List");
            System.out.println("6. Cancel Order");
            System.out.println("7. Quit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice (1-7): ");
            choice = input.nextInt();
        }
        System.out.println("Total: Rs" + total);
    }
}
