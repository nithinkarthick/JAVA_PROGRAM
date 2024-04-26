package com.trainbooking2.app;

import java.util.Scanner;

public class Main {


	public static void bookTicket(Passenger p) {

		TrainBooker booker = new TrainBooker();

		if(TrainBooker.availableWaitingTickets == 0) {
			System.out.println("No Seats Available!");
			return;
		}
		//check if preferred berth is available
		if((p.berthPreference.equals("L") && TrainBooker.availableLowerBerth > 0 )||
				(p.berthPreference.equals("M") && TrainBooker.availableMiddleBerth > 0) ||
				(p.berthPreference.equals("U") && TrainBooker.availableUpperBerth > 0) )
		{
			System.out.println("Preferred Berth Available");
			if(p.berthPreference.equals("L")) {
				System.out.println("Lower Berth Given");

				booker.bookTicket(p,(TrainBooker.lowerBerthsPositions.get(0)),"L");

				TrainBooker.lowerBerthsPositions.remove(0);
				TrainBooker.availableLowerBerth--;
			}
			else if(p.berthPreference.equals("M")) {
				System.out.println("Middle Berth given");

				booker.bookTicket(p,(TrainBooker.middleBerthsPositions.get(0)),"M");

				TrainBooker.middleBerthsPositions.remove(0);
				TrainBooker.availableMiddleBerth--;
			}
			else if(p.berthPreference.equals("U")) {
				System.out.println("Upper Berth Given");

				booker.bookTicket(p, (TrainBooker.upperBerthsPositions.get(0)),"U");

				TrainBooker.upperBerthsPositions.remove(0);
				TrainBooker.availableUpperBerth--;

			}

		}
		else if(TrainBooker.availableLowerBerth > 0)
		{
			System.out.println("Lower Berth Given");
			//call booking function in the TicketBooker class
			booker.bookTicket(p,(TrainBooker.lowerBerthsPositions.get(0)),"L");
			//remove the booked position from available positions and also decrease available seats of that
			// particular type
			TrainBooker.lowerBerthsPositions.remove(0);
			TrainBooker.availableLowerBerth--;
		}
		else if(TrainBooker.availableMiddleBerth > 0)
		{
			System.out.println("Middle Berth Given");
			//call booking function in the TicketBooker class
			booker.bookTicket(p,(TrainBooker.middleBerthsPositions.get(0)),"M");
			//remove the booked position from available positions and also decrease available seats of that
			// particular type
			TrainBooker.middleBerthsPositions.remove(0);
			TrainBooker.availableMiddleBerth--;

		}
		 else if(TrainBooker.availableUpperBerth > 0)
	        {
	            System.out.println("Upper Berth Given");
	            //call booking function in the TicketBooker class
	            booker.bookTicket(p,(TrainBooker.upperBerthsPositions.get(0)),"U");
	            //remove the booked position from available positions and also decrease available seats of that
	            // particular type
	            TrainBooker.upperBerthsPositions.remove(0);
	            TrainBooker.availableUpperBerth--;
	            
	        }

		 // if no berth available go to RAC
	        else if(TrainBooker.availableRecTickets > 0)
	        {
	            System.out.println("RAC available");
	            booker.addToRAC(p,(TrainBooker.racPositions.get(0)),"RAC" );
	        }
	        // if no RAC available go to WL
	        else if(TrainBooker.availableWaitingTickets > 0)
	        {
	            System.out.println("Added to Waiting List");
	            booker.addToWaitingList(p,(TrainBooker.waitingListPositions.get(0)),"WL");
	            
	        }


	}

	
	 //cancel ticket function
    public static void cancelTicket(int id)
    {
        TrainBooker booker = new TrainBooker();
        //check if passenger id is valid
        if(!booker.passengers.containsKey(id))
        {
            System.out.println("Passenger detail Unknown");
        }
        else
            booker.cancelTicket(id);
    }



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean loop = true;


		while(loop) {

			System.out.println(" 1. Book ticket \n 2.cancel Ticket \n 3.Available Tickets \n 4.Booked Ticket \n 5.Exit");
			System.out.println("---------------------------------------------");
			int choice = sc.nextInt();
			switch(choice) {

			case 1: 
			{
				System.out.println("Enter Passenger name, age, berth preference(L,M,W) ");
				String name = sc.next();
				int age = sc.nextInt();
				String berth = sc.next();

				Passenger p = new Passenger(name, age, berth);

				bookTicket(p);
				// book ticket

			}break;
			case 2 :
			{
				System.out.println("Enter passenger Id to cancel Ticket :");
				int id = sc.nextInt();
				
				cancelTicket(id);
				
			}break;
			case 3:
			{
				System.out.println("Ticket Available");
				TrainBooker booker = new TrainBooker();
				booker.printAvailableTickets();

			}break;

			case 4:
			{
				System.out.println("Booked ticket");

				TrainBooker booker = new TrainBooker();
				booker.printPassengers();

			}break;

			case 5:
			{
				System.out.println("Thank you using oru booking system!");
				loop = false;

			}break;
			default: System.out.println("Enter valid number to process");
			break;
			}
		}
	}
}
