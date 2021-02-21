package ConditionalStatements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int days=Integer.parseInt(scanner.nextLine());
            int food=Integer.parseInt(scanner.nextLine());
            double foodForDog=Double.parseDouble(scanner.nextLine());
            double foodForCat=Double.parseDouble(scanner.nextLine());
            double foodForTorture=Double.parseDouble(scanner.nextLine());
            double foodTorture=(foodForTorture/1000)*days;
            double foodDog=days*foodForDog;
            double foodCar= days*foodForCat;
            double allFood=foodDog+foodCar+foodTorture;
            if(allFood<=food){
                System.out.printf("%.0f kilos of food left.",Math.floor(food-allFood));
            }else {
                System.out.printf("%.0f more kilos of food are needed.",Math.ceil(allFood-food));
            }
    }
}
