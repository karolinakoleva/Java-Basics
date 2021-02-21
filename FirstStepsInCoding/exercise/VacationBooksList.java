package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class VacationBooksList {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int allSheets = Integer.parseInt(scan.nextLine());
            int sheetsPerHours = Integer.parseInt(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int totalTime = allSheets / sheetsPerHours;
            int neededHours = totalTime / days;
            System.out.print(neededHours);
        }
    }

