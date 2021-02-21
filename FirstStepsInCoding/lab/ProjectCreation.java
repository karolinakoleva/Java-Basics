package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        int Hours = Integer.parseInt(scanner.nextLine());
        int Number = Hours * 3;
        System.out.print("The architect " + Name + " will need " + Number + " hours to complete " + Hours + " project/s" + ".");


    }
}