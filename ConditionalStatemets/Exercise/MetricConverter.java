package Exercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dimension = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();
        if (input.equals("cm")) {
            dimension = dimension/100;
        }else if(input.equals("mm")) {
            dimension = dimension /1000;
        }
        if(output.equals("cm")) {
            dimension = dimension * 100;
        }else if(output.equals("mm")){
            dimension = dimension * 1000;
            }
        System.out.printf("%.3f",dimension);
        }
    }

