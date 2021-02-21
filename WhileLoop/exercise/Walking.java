package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal=10000;
        int totalSteps=0;
        while(totalSteps<goal){
            String line= scanner.nextLine();
            if(line.equals("Going home")){
                totalSteps+=Integer.parseInt(scanner.nextLine());
                break;
            }
            int currentSteps=Integer.parseInt(line);
            totalSteps+=currentSteps;
        }
        if(totalSteps>=goal) {
            System.out.printf("Goal reached! Good job!%n"+
                    "%d steps over the goal!",totalSteps-goal);
        }else {
            System.out.printf("%d more steps to reach goal.",goal-totalSteps);

        }
    }
}
