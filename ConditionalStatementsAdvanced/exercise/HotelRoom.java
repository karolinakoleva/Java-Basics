package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month= scanner.nextLine();
        int nights=Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment=0;
        switch (month){
            case("May"):
            case("October"):
                priceApartment=65;
                priceStudio=50;
                if(nights>7&&nights<=14){
                    priceStudio*=0.95;
                } else if (nights>14){
                priceStudio*=0.7;
            }
                 break;
            case("June"):
            case ("September"):
                priceApartment=68.7;
                priceStudio=75.2;
                if(nights>14){
                    priceStudio*=0.8;
                }
                        break;
            case("July"):
            case ("August"):
                priceApartment=77;
                priceStudio=76;
                break;
        }
                if(nights>14){
                    priceApartment*=0.9;
                }
                double finalPriceApart=nights*priceApartment;
                double finalPriceStudio=nights*priceStudio;
            System.out.printf("Apartment: %.2f lv.%n",finalPriceApart);
            System.out.printf("Studio: %.2f lv.",finalPriceStudio);
    }
}
