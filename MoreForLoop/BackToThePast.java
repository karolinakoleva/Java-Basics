package FoorLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double inheritedMoney=Double.parseDouble(scanner.nextLine());
int yearToLive=Integer.parseInt(scanner.nextLine());
int year=1800;
int years=17;
int expenses=0;
        for (int i = 1800; i <=yearToLive ; i++) {
            if(year%2==0){
                ++years;
                year++;
                expenses=12000;
                inheritedMoney-=expenses;
            }else{
                years++;
                year++;
                expenses=12000 + 50 *years;
                inheritedMoney-=expenses;
            }
        }
        if(inheritedMoney>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",inheritedMoney);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(inheritedMoney));
        }
    }
}
