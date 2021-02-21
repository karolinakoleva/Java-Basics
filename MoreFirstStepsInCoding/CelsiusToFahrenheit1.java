package FirstStepsInCoding;

import java.util.Scanner;

public class CelsiusToFahrenheit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreeC=Double.parseDouble(scanner.nextLine());
        double degreeF=(degreeC * 9/5) + 32;
        System.out.printf("%.2f",degreeF);
    }
}
