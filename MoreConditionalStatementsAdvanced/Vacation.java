package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                       double budget=Double.parseDouble(scanner.nextLine());
                String season=scanner.nextLine();
                if(budget<=1000){
                    if(season.equals("Summer")){
                        System.out.printf("Alaska - Camp - %.2f",budget*0.65);
                    }else if(season.equals("Winter")){
                        System.out.printf("Morocco - Camp - %.2f",budget*0.45);
                    }
                }
                if(budget>1000&&budget<=3000){
                    if(season.equals("Summer")){
                        System.out.printf("Alaska - Hut - %.2f",budget*0.8);
                    }else if(season.equals("Winter")){
                        System.out.printf("Morocco - Hut - %.2f",budget*0.6);
                    }
                }
                if(budget>3000) {
                    if (season.equals("Summer")) {
                        System.out.printf("Alaska - Hotel - %.2f", budget * 0.9);
                    } else if (season.equals("Winter")) {
                        System.out.printf("Morocco - Hotel - %.2f", budget * 0.9);
                    }
                }}}
