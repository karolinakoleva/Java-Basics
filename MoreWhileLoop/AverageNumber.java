package WhileLoop;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        double avgSum=0;
        for (int i = 1; i <= n; i++) {
            int num=Integer.parseInt(scanner.nextLine());
sum=sum+num;
avgSum=sum*1.0/n;
        }
        System.out.printf("%.2f",avgSum);
    }
}
