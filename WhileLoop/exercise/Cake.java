package FirstStepsInCoding.lab.lab.exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int totalPieces = width * lenght;
        String input= scanner.nextLine();
        while (!input.equals("STOP")){
            int cakePieces=Integer.parseInt(input);
            totalPieces-=cakePieces;
            if(totalPieces<=0){
                break;
            }
            input= scanner.nextLine();
        }
        if(input.equals("STOP")){
            System.out.printf("%d pieces are left.",totalPieces);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));
        }
    }
}
