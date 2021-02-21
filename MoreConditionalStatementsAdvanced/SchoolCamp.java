package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String type = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (season.equals("Winter")) {
            if (type.equals("girls")) {
                if (students >= 50) {
                    price = students*nights*9.60 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 9.60 * 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights * 9.60 * 0.95;
                }else if(students<10){
                price=students*nights*9.6;
            }

                System.out.printf("Gymnastics %.2f lv.", price);
            }
            if (type.equals("boys")) {
                if (students >= 50) {
                    price = students*nights*9.60 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 9.60 * 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*9.60  * 0.95;
                }else if(students<10){
                    price=students*nights*9.6;
                                    }
                System.out.printf("Judo %.2f lv.", price);
            }
            if (type.equals("mixed")) {
                if (students >= 50) {
                    price = students*nights*10 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights*10  *  0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*10 * 0.95;
                }else if(students<10){
                    price=students*nights*10;
                }
                System.out.printf("Ski %.2f lv.", price);
            }
        }
        if (season.equals("Spring")) {
            if (type.equals("girls")) {
                if (students >= 50) {
                    price = students*nights*7.20 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 7.20* 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights * 7.20 * 0.95;
                }else if(students<10){
                    price=students*nights*7.20;
                }

                System.out.printf("Athletics %.2f lv.", price);
            }
            if (type.equals("boys")) {
                if (students >= 50) {
                    price = students*nights*7.20 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 7.20 * 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*7.20  * 0.95;
                }else if(students<10){
                    price=students*nights*7.20;
                }
                System.out.printf("Tennis %.2f lv.", price);
            }
            if (type.equals("mixed")) {
                if (students >= 50) {
                    price = students*nights*9.50 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights*9.50  *  0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*9.50 * 0.95;
                }else if(students<10){
                    price=students*nights*9.50;
                }
                System.out.printf("Cycling %.2f lv.", price);
            }
        }
        if (season.equals("Summer")) {
            if (type.equals("girls")) {
                if (students >= 50) {
                    price = students*nights*15 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 15* 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights * 15 * 0.95;
                }else if(students<10){
                    price=students*nights*15;
                }

                System.out.printf("Volleyball %.2f lv.", price);
            }
            if (type.equals("boys")) {
                if (students >= 50) {
                    price = students*nights*15* 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights* 15 * 0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*15  * 0.95;
                }else if(students<10){
                    price=students*nights*15;
                }
                System.out.printf("Football %.2f lv.", price);
            }
            if (type.equals("mixed")) {
                if (students >= 50) {
                    price = students*nights*20 * 0.5;
                } else if (students < 50 && students >= 20) {
                    price = students*nights*20  *  0.85;
                } else if (students < 20 && students >= 10) {
                    price = students*nights*20 * 0.95;
                }else if(students<10){
                    price=students*nights*20;
                }
                System.out.printf("Swimming %.2f lv.", price);
            }
        }
    }
    }
