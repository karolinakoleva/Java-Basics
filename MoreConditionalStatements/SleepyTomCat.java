package ConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays=Integer.parseInt(scanner.nextLine());
        int workingDays=365-holidays;
        int playHours=workingDays*63+holidays*127;
        int norm=30000;
        int mins = Math.abs(norm - playHours) % 60;
        int hours = Math.abs(norm - playHours) / 60;
        if(playHours>norm){
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play",hours,mins);
        }else{
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play",hours,mins);
        }


    }
}
