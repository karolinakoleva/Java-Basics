package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        double rate = 1.79549;
        double bgn = usd * rate;
        System.out.print(bgn);
    }
}
