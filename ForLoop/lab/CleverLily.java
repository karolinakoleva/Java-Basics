package FirstStepsInCoding.lab.lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int priceToy=Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        int countBrother=0;
        double money=0;
        double sumMoney=0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
            countToys++;
            }else {
                countBrother++;
                money=money +10;
                sumMoney+=money;
            }
        }
        double toysMoney=countToys*priceToy;
        double allMoney = toysMoney+sumMoney-countBrother;
       double diff=Math.abs(allMoney-priceWashMachine);
       if (priceWashMachine<=allMoney){
           System.out.printf("Yes! %.2f",diff);
       }else {
           System.out.printf("No! %.2f", diff);
       }
    }
}
