package Exam;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int egg=Integer.parseInt(scanner.nextLine());
        int red=0;
        int orange=0;
        int blue=0;
        int green=0;
        int maxNum=Integer.MIN_VALUE;
        String maxEgg="";
        for (int i = 0; i <egg ; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    if (red > maxNum) {
                        maxNum = red;
                        maxEgg = "red";

                    }
                    break;
                case "orange":
                    orange++;
                    if (orange > maxNum) {
                        maxNum = orange;
                        maxEgg = "orange";

                    }
                    break;
                case "blue":
                    blue++;
                    if (blue > maxNum) {
                        maxNum = blue;
                        maxEgg = "blue";
                    }
break;
                case "green":
                    green++;
                    if (green > maxNum) {
                        maxNum = green;
                        maxEgg = "green";
                    }
break;
            }

        }
        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n",blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s%n",maxNum,maxEgg);
   }}
