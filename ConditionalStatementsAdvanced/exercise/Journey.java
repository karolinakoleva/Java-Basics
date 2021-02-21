package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double expenses = 0;
        String destination = "";
        String accommodation ="";
        if(budget<=100) {
            destination = "Bulgaria";
            switch (season){
                case"summer":
                    expenses=budget*0.3;
                    accommodation="Camp";
                    break;
                case"winter":
                    expenses=budget*0.7;
                    accommodation="Hotel";
                    break;
            }
        }else if (budget<=1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    expenses = budget * 0.4;
                    accommodation="Camp";
                    break;
                case "winter":
                    expenses = budget * 0.8;
                    accommodation="Hotel";
                    break;
            }
        }else{
            destination = "Europe";
            expenses=budget*0.9;
            accommodation="Hotel";
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",accommodation,expenses);
    }
}
