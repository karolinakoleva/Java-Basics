package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (typeFlowers) {
            case "Roses":
                price = numFlowers * 5;
                if (numFlowers > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = numFlowers * 3.80;
                if (numFlowers > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = numFlowers * 2.80;
                if (numFlowers > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = numFlowers * 3;
                if (numFlowers < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = numFlowers * 2.5;
                if (numFlowers < 80) {
                    price *= 1.2;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, budget - price);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}


