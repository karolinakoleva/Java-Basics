package Exam;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        String command = scanner.nextLine();
        int startPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        boolean isWin=false;
        while (!command.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }
            if (points <= startPoints) {
                startPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }
            if (startPoints == 0) {
                isWin = true;
                break;
            }
            command = scanner.nextLine();
        }if(isWin){
                System.out.printf("%s won the leg with %d shots.", playerName, successfulShots);
            } else {
                System.out.printf("%s retired after %d unsuccessful shots.",playerName,unsuccessfulShots);
            }
        }}
