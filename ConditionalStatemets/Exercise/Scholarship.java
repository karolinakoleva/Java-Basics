package Exercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double avgScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0;
        double excellentScolarship = 0;
        String output = "";
        if (avgScore > 4.50) {
            if (income < minSalary) {
                socialScholarship = Math.floor(minSalary * 0.35);
            }
        }
        if (avgScore >= 5.50) {
            excellentScolarship = Math.floor(avgScore * 25);
        }
        if (socialScholarship == 0 && excellentScolarship == 0) {
            output = "You cannot get a scholarship!";
        }else if (socialScholarship > excellentScolarship) {
            output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
        } else {
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellentScolarship);
        }
        System.out.println(output);
    }
}
