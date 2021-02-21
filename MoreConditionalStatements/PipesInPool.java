package ConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double pipe1 = P1 * H;
        double pipe2 = P2 * H;
        double pipes = pipe1 + pipe2;
        double percent=(pipes/V)*100;
        double percent1=(pipe1/ pipes) * 100;
        double percent2=(pipe2/ pipes) * 100;

        if (pipes <= V) {
            System.out.printf("The pool is %.2f %% full. Pipe 1: %.2f %%. Pipe 2: %.2f %%.",percent, percent1,percent2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, pipes - V);
        }

    }
}
