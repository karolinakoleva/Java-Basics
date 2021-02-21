package FirstStepsInCoding;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());;

        double areaHouseFrontWall = x * x - 1.2 * 2.0;
        double areaHouseBackWall = x * x;
        double areaHouseSideWall = y * x - 1.5 * 1.5;
        double allWalls = areaHouseSideWall * 2.0 + areaHouseBackWall + areaHouseFrontWall;
        double housePaint = allWalls / 3.4;
        double areaRoofFront = x * h / 2.0;
        double areaRoofWalls=x*y;
        double allRoof=2*(areaRoofFront+areaRoofWalls);
        double roofPaint = allRoof / 4.3;
        System.out.printf("%.2f%n",housePaint);
        System.out.printf("%.2f",roofPaint);
    }
}
