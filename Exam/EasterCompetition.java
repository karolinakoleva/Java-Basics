package Exam;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bread = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxNum = 0;
        for (int i = 1; i <= bread; i++) {
            String bakerName = scanner.nextLine();
            int result = 0;
            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                result += points;
                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, result);

            if (result > maxNum) {
                maxNum = result;
                System.out.printf("%s is the new number 1!%n", bakerName);
                winner = bakerName;
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxNum);

    }
}