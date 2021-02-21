package NestedLoops.exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int number=0;
        boolean isequal=false;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                number++;
                if (number>n){
                    isequal=true;
                    break;
                }
                System.out.print(number+" ");
            }
            if(isequal){
                break;
            }
            System.out.println();
        }
    }
}
