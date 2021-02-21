package WhileLoop;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        double detergent = bottles * 750;
        String command = scanner.nextLine();
        int counterDishes = 0;
        int counterPots = 0;
        int utensilsSum = 0;

        while (!command.equals("End")) {

            int utensils = Integer.parseInt(command);
            utensilsSum ++;

            if (utensilsSum % 3 == 0) {
                counterPots += utensils;
                detergent -= utensils * 15;

            } else {
                counterDishes += utensils;
                detergent -= utensils * 5;

            }
            if (detergent < 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (detergent < 0) {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(detergent));
        } else {
            System.out.print("Detergent was enough!\n");
            System.out.printf("%d dishes and %d pots were washed.%n", counterDishes, counterPots);
            System.out.printf("Leftover detergent %.0f ml.", detergent);
        }
    }
}
