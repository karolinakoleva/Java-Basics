package ConditionalStatements;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double price=0;
        if (type.equals("Gas")){
            if (clubCard.equals("Yes")){
                 price = (0.93 - 0.08) * fuel ;
            }else {
               price=  fuel*0.93;
            }
        }
        if (type.equals("Gasoline")){
            if (clubCard.equals("Yes")) {
                 price = (2.22 - 0.18)* fuel;
            }else {
                 price=  fuel*2.22;
            }
        }
        if (type.equals("Diesel")){
            if (clubCard.equals("Yes")) {
                 price = (2.33 - 0.12)*fuel;
            }else {
                 price=  fuel*2.33;
            }
        }
        if(fuel<=25 && fuel>=20){
            System.out.printf("%.2f lv.",price-price*0.08);
        }else if(fuel>25){
            System.out.printf("%.2f lv.",price-price*0.1);
        }
else {
            System.out.printf("%.2f lv.",price);
    }
}
}
