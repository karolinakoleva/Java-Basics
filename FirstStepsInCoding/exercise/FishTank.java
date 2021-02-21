package FirstStepsInCoding.exercise;
import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double volumeInCm = length * height * width;
        double volumeInLitres = volumeInCm * 0.001;
        double neededLitres = volumeInLitres - volumeInLitres * percent/100;
        System.out.printf("%.2f", neededLitres);
    }
}
