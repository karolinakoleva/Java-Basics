package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isLost=false;
        for (int i = 0; i < tabs; i++) {
            String website = scanner.nextLine();
            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                isLost=true;
                break;
            }
        }
        if(isLost){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(salary);

        }
    }
}