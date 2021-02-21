package Exam;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor=Integer.parseInt(scanner.nextLine());
        int ramMemory=Integer.parseInt(scanner.nextLine());
        int priceVideoCard=250;
        double priceVideoCards=videoCard*priceVideoCard;
        double priceProcessor=priceVideoCards*0.35;
        double priceProcessors=processor*priceProcessor;
        double priceRamMemory=priceVideoCards*0.1;
        double priceRamMemories=ramMemory*priceRamMemory;
        double sum=priceVideoCards+priceProcessors+priceRamMemories;
        if(processor<videoCard){
            sum=sum-(sum*0.15);
        }
        if(budget>=sum){
            System.out.printf("You have %.2f leva left!",budget-sum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",sum-budget);
        }
    }
}
