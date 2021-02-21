package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumTicketAllMovies=0;
        int studentCount=0;
        int kidCount=0;
        int standartCount=0;

        while (true){
            String movie= scanner.nextLine();
            if(movie.equals("Finish")){
                break;
            }
            int freeSeats=Integer.parseInt(scanner.nextLine());
            int countAllMovieTicket=0;
            int countFreeSeats=freeSeats;
            while(countFreeSeats>0){
                String type= scanner.nextLine();
                if(type.equals("End")){
                    break;
                }
                switch (type){
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standartCount++;
                        break;
                    case"kid":
                        kidCount++;
                        break;
                }
                countFreeSeats--;
                countAllMovieTicket++;
            }
            sumTicketAllMovies+=countAllMovieTicket;
            double percentTakenSeats=(countAllMovieTicket*1.0)/freeSeats*100;
            System.out.printf("%s - %.2f%% full.%n",movie,percentTakenSeats);
        }
        System.out.printf("Total tickets: %d%n",sumTicketAllMovies);
        System.out.printf("%.2f%% student tickets.%n",studentCount*1.0/sumTicketAllMovies*100);
        System.out.printf("%.2f%% standard tickets.%n",standartCount*1.0/sumTicketAllMovies*100);
        System.out.printf("%.2f%% kids tickets.%n",kidCount*1.0/sumTicketAllMovies*100);
    }
}
