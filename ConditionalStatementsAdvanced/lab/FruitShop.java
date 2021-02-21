package FirstStepsInCoding.lab.lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        boolean iserror = false;
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    price = quantity * 2.5;
                    break;
                case "apple":
                    price = quantity * 1.20;
                    break;
                case "orange":
                    price = quantity * 0.85;
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    break;
                case "kiwi":
                    price = quantity * 2.70;
                    break;
                case "pineapple":
                    price = quantity * 5.50;
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    break;

                default:
                    iserror = true;
                    break;
            }


        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    price = quantity * 2.7;
                    break;
                case "apple":
                    price = quantity * 1.25;
                    break;
                case "orange":
                    price = quantity * 0.9;
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    break;
                case "kiwi":
                    price = quantity * 3.0;
                    break;
                case "pineapple":
                    price = quantity * 5.60;
                    break;
                case "grapes":
                    price = quantity * 4.20;
                    break;
                default:
                    iserror = true;
                    break;
            }
        } else {
            iserror = true;
        }
        if (iserror) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }
    }
}