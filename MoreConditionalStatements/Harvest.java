package ConditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int vineyard = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double literWine = 2.5 * grape;
       double totalGrape=vineyard*grape;
       double wine=0.4*totalGrape/2.5;
       if(wine>=neededWine){
           double diff=Math.ceil(wine-neededWine);
           System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wine));
           System.out.printf("%.0f liters left -> %.0f liters per person.",diff,Math.ceil(diff/workers));
       }else {
           System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededWine-wine));
       }
    }
}
