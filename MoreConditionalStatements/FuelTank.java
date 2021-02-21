package ConditionalStatements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();
        double fuel=Double.parseDouble(scanner.nextLine());
        if(type.equals("Gas")) {
            if (fuel >= 25) {
                System.out.printf("You have enough %s.", type.toLowerCase());
            } else if (fuel < 25) {
                System.out.printf("Fill your tank with %s!", type.toLowerCase());
            }
        }
        else if(type.equals("Gasoline")) {
            if (fuel >= 25) {
                System.out.printf("You have enough %s.", type.toLowerCase());
            } else if (fuel < 25) {
                System.out.printf("Fill your tank with %s!", type.toLowerCase());
            }
        }
        else if(type.equals("Diesel")) {
            if (fuel >= 25) {
                System.out.printf("You have enough %s.", type.toLowerCase());
            } else if (fuel < 25) {
                System.out.printf("Fill your tank with %s!", type.toLowerCase());
            }
        }else {
                System.out.print("Invalid fuel!");
        }
    }
}
