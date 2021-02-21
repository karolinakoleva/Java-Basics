package FirstStepsInCoding.lab.lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String review = scanner.nextLine();
        int nights = days - 1;
        double result = 0;
        if (type.equals("room for one person")) {
            result = 18 *nights;
    }else if(type.equals("apartment")) {
            result =25 *nights;
            if (days < 10) {
                result = result*0.7;
            }else if(days< 15) {
                result = result*0.65;
            } else if(days>15){
                result=result*0.5;
            }
        }else if(type.equals("president apartment")){
            result=35*nights;
            if (days < 10) {
                result = result *0.9;
            }else if(days< 15) {
                result = result *0.85;
            } else if(days>15){
                result = result *0.8;
            }
        }
        if(review.equals("positive")){
            result = result *1.25;
        }else {
            result = result *0.9;
        }
        System.out.printf("%.2f",result);
    }
}
