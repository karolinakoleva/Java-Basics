package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=Double.parseDouble(scanner.nextLine());
        while (a>=0){
            System.out.printf("Result: %.2f%n",2*a);
            a=Double.parseDouble(scanner.nextLine());
        }
        if(a<0){
            System.out.println("Negative number!");
        }
        }
    }

