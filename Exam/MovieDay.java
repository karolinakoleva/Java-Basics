package Exam;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeShooting=Integer.parseInt(scanner.nextLine());
        int scene=Integer.parseInt(scanner.nextLine());
        int timeScene=Integer.parseInt(scanner.nextLine());
        double preparation=0.15*timeShooting;
        double time=preparation+timeScene*scene;
        if(time<=timeShooting){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timeShooting-time);
        }else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",time-timeShooting);
        }
    }
}
