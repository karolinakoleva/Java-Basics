package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (failedTimes < number) {
            String problem = scanner.nextLine();
            if(problem.equals("Enough")){
                isFailed=false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade<=4){
                failedTimes++;
            }
            gradesSum+=grade;
            solvedProblems++;
            lastProblem=problem;
        }
        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",number);
        }else {
            System.out.printf("Average score: %.2f%n",gradesSum/solvedProblems);
            System.out.printf("Number of problems: %d%n",solvedProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
