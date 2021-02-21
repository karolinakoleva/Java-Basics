package NestedLoops.exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n=Integer.parseInt(scanner.nextLine());
String input= scanner.nextLine();
double totalGradesSum=0;
        int presentationCount=0;
        while(!input.equals("Finish")){
    String presentation=input;
    presentationCount++;
    double averageGrade=0;
    double sumGrades=0;
    for (int i = 1; i <=n; i++) {
        double grade=Double.parseDouble(scanner.nextLine());
        sumGrades+=grade;
            }
    averageGrade=sumGrades/n;
    totalGradesSum+=averageGrade;
    System.out.printf("%s - %.2f.%n",presentation,averageGrade);
    input= scanner.nextLine();
}
        System.out.printf("Student's final assessment is %.2f.",totalGradesSum/presentationCount);
        }
    }

