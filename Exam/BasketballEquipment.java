package Exam;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax=Integer.parseInt(scanner.nextLine());
        double sneakers=tax*0.6;
        double outfit=sneakers*0.8;
        double ball=outfit/4;
        double accessories=ball/5;
        double sum=tax+sneakers+outfit+ball+accessories;
        System.out.printf("%.2f",sum);
    }
}
