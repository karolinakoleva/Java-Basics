package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rentHall = Integer.parseInt(scan.nextLine());
        double cakePrice = rentHall * 0.2;
        double drinks = cakePrice - (cakePrice * 0.45);
        double animator = rentHall / 3.0;
        double budget = cakePrice + drinks + animator +rentHall;
        System.out.println(budget);
    }
}
