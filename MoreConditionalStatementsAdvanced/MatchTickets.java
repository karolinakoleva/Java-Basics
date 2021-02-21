package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double budget=Double.parseDouble(scanner.nextLine());
String category= scanner.nextLine();
int people=Integer.parseInt(scanner.nextLine());
        double transport=0;
        double leftMoney=0;
        double allTickets=0;
        double ticket = 0;
        if (category.equals("Normal")){
            ticket = 249.99;
        }else if(category.equals("VIP")){
            ticket = 499.99;
        }
        allTickets=ticket*people;
        if(people>=1&&people<=4){
            transport=budget*0.75;
            leftMoney=budget-transport;
        }
        if(people>=5&&people<=9){
            transport=budget*0.6;
            leftMoney=budget-transport;
        }
        if(people>=10&&people<=24){
            transport=budget*0.5;
            leftMoney=budget-transport;
        }
        if(people>=25&&people<=49){
            transport=budget*0.4;
            leftMoney=budget-transport;
        }
        if(people>=50){
            transport=budget*0.25;
            leftMoney=budget-transport;
        }
        if (leftMoney>=allTickets){
            System.out.printf("Yes! You have %.2f leva left.",leftMoney-allTickets);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",allTickets-leftMoney);
        }
    }
}
