package FirstStepsInCoding.lab.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double result = 0;
        if (town.equals("Sofia")) {
            if(sales>=0 && sales<=500) {
                result = sales * 0.05;
            }else if(sales<=1000){
                result = sales * 0.07;
            }else if(sales<=10000) {
                result = sales * 0.08;
            } else{
                result = sales * 0.12;
            }
            }else if (town.equals("Varna")){
            if(sales>=0 && sales<=500) {
            }else if(sales<=1000){
            }else if(sales<=10000) {
            } else{
            }
        }else if (town.equals("Plovdiv")){
            if(sales>=0 && sales<=500) {
            }else if(sales<=1000){
            }else if(sales<=10000) {
            } else{
            }
        }
        System.out.printf("%.2f",result);
    }
}
