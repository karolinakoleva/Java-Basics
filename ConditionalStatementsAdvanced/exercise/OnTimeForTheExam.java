package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());
        int examTime=examHour*60+examMinutes;
        int arrivedTime = arriveHour*60+arriveMinutes;
        String output = "";
        String output2 = "";
        int difference = 0;
        if (arrivedTime<examTime-30) {
            output="Early";
            difference=examTime-arrivedTime;
            if(difference<60) {
                output2 = String.format("%02d minutes before the start", difference);
            }else {
                int hour = difference/60;
                int minutes = difference%60;
                        output2=String.format("%d:%02d hours before the start",hour,minutes);
            }
        }else if(arrivedTime<=examTime) {
            output="On time";
            difference=examTime-arrivedTime;
            output2=String.format("%d minutes before the start",difference);

        }else if(arrivedTime>examTime){
                        output="Late";
                        difference=arrivedTime-examTime;
            if(difference<60) {
                output2 = String.format("%d minutes after the start", difference);
            }else {
                int hour = difference/60;
                int minutes = difference%60;
                output2=String.format("%d:%02d hours after the start",hour,minutes);
            }
        }
        System.out.println(output);
        System.out.println(output2);
    }
}
