package MoreNestedLoops;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int maxNum=Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean counterCombinations = false;
        int firstSymbol = 35;
        int secondSymbol = 64;

        while (maxNum > counter) {
            if (counterCombinations) {
                break;
            }
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    char A = (char) firstSymbol;
                    char B = (char) secondSymbol;
                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                    counter++;
                    firstSymbol++;
                    secondSymbol++;
                    if (firstSymbol > 55) {
                        firstSymbol = 35;
                    }
                    if (secondSymbol > 96) {
                        secondSymbol = 64;
                    }
                    if (counter == maxNum) {
                        counterCombinations = true;
                        break;
                    }
                }
                if (counterCombinations) {
                    break;
                }
                if (x == a) {
                    counterCombinations = true;
                    break;
                }
            }
        }
    }
}
