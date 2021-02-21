package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season= scanner.nextLine();
        double kilometers=Double.parseDouble(scanner.nextLine());
        double earning=0;
        if(season.equals("Spring")||season.equals("Autumn")){
            if(kilometers<=5000){
                earning=kilometers*0.75*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>5000&&kilometers<=10000){
                earning=kilometers*0.95*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>10000&&kilometers<=20000){
                earning=kilometers*1.45*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
        }
        if(season.equals("Summer")){
            if(kilometers<=5000){
                earning=kilometers*0.9*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>5000&&kilometers<=10000){
                earning=kilometers*1.1*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>10000&&kilometers<=20000){
                earning=kilometers*1.45*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
        }
        if(season.equals("Winter")){
            if(kilometers<=5000){
                earning=kilometers*1.05*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>5000&&kilometers<=10000){
                earning=kilometers*1.25*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
            if(kilometers>10000&&kilometers<=20000){
                earning=kilometers*1.45*4;
                System.out.printf("%.2f",earning- earning*0.1);
            }
        }
    }
}
