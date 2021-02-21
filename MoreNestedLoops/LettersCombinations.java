package MoreNestedLoops;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String miss = scanner.nextLine();

        char a = start.charAt(0);
        char b = end.charAt(0);
        char c = miss.charAt(0);
        int counter=0;
        for (int i = a; i <=b ; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = a; k <= b; k++) {
                    if(i!=c && j!=c && k!=c){
                        counter++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
                
            }
            
        }
        System.out.printf("%d" , counter);
    }
}
