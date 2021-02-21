package Exam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double entrance=Double.parseDouble(scanner.nextLine());
        double priceLounger=Double.parseDouble(scanner.nextLine());
        double priceUmbrella=Double.parseDouble(scanner.nextLine());
        double sumPrice=people*entrance;
        double countLounger=Math.ceil(0.75*people);
        double sumLounger=countLounger*priceLounger;
        double countUmbrella=Math.ceil(people*0.5);
        double sumUmbrella=countUmbrella*priceUmbrella;
        double sum=sumPrice+sumLounger+sumUmbrella;
        System.out.printf("%.2f lv.",sum);
    }
}
