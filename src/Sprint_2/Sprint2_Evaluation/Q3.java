package Sprint_2.Sprint2_Evaluation;

import java.util.Scanner;

class Tickets{
    int ticketId;
    int price;
    static int availTickets = 25;

    public int calculateTicketCost(int noOfTickets, int price){
        return noOfTickets*price;
    }
    public int availableTickets(int noOfTickets, int tickets){
        return noOfTickets-tickets;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Tickets obj = new Tickets();

        System.out.println("Enter Number of bookings");
        int count = sc.nextInt();
        System.out.println("============================");
        for(int i=0; i<count; i++){
            System.out.println("Enter the available tickets:");
            int noOfTickets = sc.nextInt();

            System.out.println("Enter the ticketId:");
            int ticketId = sc.nextInt();

            System.out.println("Enter the price: ");
            int price = sc.nextInt();

            System.out.println("Enter the no of tickets: ");
            int tickets = sc.nextInt();


            int totalAmount = obj.calculateTicketCost(tickets,price);


            int leftTickets = obj.availableTickets(noOfTickets,tickets);



            System.out.println("Available tickets:"+ obj.availTickets);
            System.out.println("Total amount:"+ totalAmount);
            System.out.println("Available ticket after booking:"+ leftTickets);

            noOfTickets = noOfTickets-tickets;
        }
    }
}
