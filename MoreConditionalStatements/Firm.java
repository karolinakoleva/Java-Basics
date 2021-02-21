package ConditionalStatements;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours=Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int workers=Integer.parseInt(scanner.nextLine());
double training=days-0.1*days;
double workingHours=training*8;
int exclusive=workers*2*days;
double allHours=workingHours+exclusive;
if(allHours>=neededHours){
    System.out.printf("Yes!%.0f hours left.",Math.floor(allHours-neededHours));
}else {
    System.out.printf("Not enough time!%.0f hours needed.",Math.ceil(neededHours-allHours));
}
    }
}
