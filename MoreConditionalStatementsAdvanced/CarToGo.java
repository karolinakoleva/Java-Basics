package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
    if(budget<=100){
        System.out.println("Economy class");
        if(season.equals("Summer")){
            System.out.printf("Cabrio - %.2f",budget*0.35);
        }else if(season.equals("Winter")){
            System.out.printf("Jeep - %.2f",budget*0.65);
        }
    }
        if(budget>100&&budget<=500){
            System.out.println("Compact class");
            if(season.equals("Summer")){
                System.out.printf("Cabrio - %.2f",budget*0.45);
            }else if(season.equals("Winter")){
                System.out.printf("Jeep - %.2f",budget*0.8);
            }
        }
        if(budget>500){
            System.out.println("Luxury class");
            System.out.printf("Jeep - %.2f",budget*0.9);
        }
    }
}
