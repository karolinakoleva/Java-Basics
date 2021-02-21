package MoreNestedLoops;

import java.util.Scanner;

public class SecretDoorSLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hundreds = Integer.parseInt(scanner.nextLine());
        int decimals = Integer.parseInt(scanner.nextLine());
        int units = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= hundreds; i += 2) {
            for (int j = 1; j <= decimals; j++) {
                for (int k = 2; k <= units; k += 2) {
                    if (j == 3 || j == 5 || j == 7 || j == 2) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
