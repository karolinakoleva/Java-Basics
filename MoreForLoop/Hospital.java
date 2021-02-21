package FoorLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    int days=Integer.parseInt(scanner.nextLine());
    int patientsNotVisited=0;
    int checkedPatients=0;
    int doctors=7;
        for (int day = 1; day <=days ; day++) {
            int patients = Integer.parseInt(scanner.nextLine());
            {
                if (day % 3 == 0 && patientsNotVisited > checkedPatients) {
                    doctors++;
                }
            }
            if (patients <= doctors) {
                checkedPatients += patients;
            } else {
                checkedPatients += doctors;
                patientsNotVisited += patients - doctors;
            }}
            System.out.printf("Treated patients: %d.%n", checkedPatients);
            System.out.printf("Untreated patients: %d.", patientsNotVisited);
        }
    }
