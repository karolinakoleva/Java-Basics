package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());
        double interest = depositSum * interestRate / 100;
        double sumPerMonth = interest / 12;
        double totalSum = depositSum + months * sumPerMonth;
        System.out.print(totalSum);
    }
}
