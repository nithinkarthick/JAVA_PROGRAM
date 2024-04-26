package com.trainbooking2.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TrainBooker {

	static int availableLowerBerth = 1;
	static int availableUpperBerth = 1;
	static int availableMiddleBerth = 1;
	static int availableRecTickets = 1;
	static int availableWaitingTickets = 1;
	
	static Queue<Integer> waitingList = new LinkedList<>();
	static Queue<Integer> racList = new LinkedList<>();
	static List<Integer> bookedTicketList = new ArrayList<>();
	
	static List<Integer> lowerBerthsPositions = new ArrayList<>(Arrays.asList(1));//normally 1,2,...21
    static List<Integer> middleBerthsPositions = new ArrayList<>(Arrays.asList(1));//normally 1,2,...21
    static List<Integer> upperBerthsPositions = new ArrayList<>(Arrays.asList(1));//normally 1,2,...21
    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1));//normally 1,2,...18
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1));//normally 1,2,...10

    static Map<Integer, Passenger> passengers = new HashMap<>();//map of passenger ids to passengers

	
    
    public void bookTicket(Passenger p , int berthInfo, String allotedBerth) {
    	
    	p.number = berthInfo;
    	p.alloted = allotedBerth;
    	
    	passengers.put(p.passengerId, p);
    	
    	bookedTicketList.add(p.passengerId);
    	System.out.println("----------------- Booked Sucessfully!");
    }
    
  //adding to RAC
    public void addToRAC(Passenger p,int racInfo,String allotedRAC)
    {
        //assign seat number and type(RAC)
        p.number = racInfo;
        p.alloted = allotedRAC;
        // add passenger to the map
        passengers.put(p.passengerId,p);
        //add passenger id to the queue of RAC tickets
        racList.add(p.passengerId);
        //decrease available RAC tickets by 1    
        availableRecTickets--;
        //remove the position that was alloted to the passenger
        racPositions.remove(0);

        System.out.println("--------------------------added to RAC Successfully");
    }
    
    //adding to WL
    public void addToWaitingList(Passenger p,int waitingListInfo,String allotedWL)
    {
        //assign seat number and type(WL)
        p.number = waitingListInfo; 
        p.alloted = allotedWL;
        // add passenger to the map
        passengers.put(p.passengerId,p);
        //add passenger id to the queue of WL tickets
        waitingList.add(p.passengerId);
        //decrease available WL tickets by 1    
        availableWaitingTickets--;
        //remove the position that was alloted to the passenger
        waitingListPositions.remove(0);

        System.out.println("-------------------------- added to Waiting List Successfully");
    }
    
    
    //cancel ticket
    public void cancelTicket(int passengerId)
    {
        //remove the passenger from the map
        Passenger p = passengers.get(passengerId);
        passengers.remove(Integer.valueOf(passengerId));
        //remove the booked ticket from the list
        bookedTicketList.remove(Integer.valueOf(passengerId));

        //take the booked position which is now free
        int positionBooked = p.number;

        System.out.println("---------------cancelled Successfully");

        //add the free position to the correspoding type of list (either L,M,U)
        if(p.alloted.equals("L")) 
        { 
          availableLowerBerth++;
          lowerBerthsPositions.add(positionBooked);
        }
        else if(p.alloted.equals("M"))
        { 
          availableMiddleBerth++;
          middleBerthsPositions.add(positionBooked);
        }
        else if(p.alloted.equals("U"))
        { 
          availableUpperBerth++;
          upperBerthsPositions.add(positionBooked);
        }

        //check if any RAC is there
        if(racList.size() > 0)
        {
            //take passenger from RAC and increase the free space in RAC list and increase available RAC tickets
            Passenger passengerFromRAC = passengers.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(Integer.valueOf(passengerFromRAC.passengerId));
            availableRecTickets++;

            //check if any WL is there
            if(waitingList.size()>0)
            {
                //take the passenger from WL and add them to RAC , increase the free space in waiting list and 
                //increase available WL and decrease available RAC by 1
                Passenger passengerFromWaitingList = passengers.get(waitingList.poll());
                int positionWL = passengerFromWaitingList.number;
                waitingListPositions.add(positionWL);
                waitingList.remove(Integer.valueOf(passengerFromWaitingList.passengerId));

                passengerFromWaitingList.number = racPositions.get(0);
                passengerFromWaitingList.alloted = "RAC";
                racPositions.remove(0);
                racList.add(passengerFromWaitingList.passengerId);
                
                availableWaitingTickets++;
                availableRecTickets--;
            }
            // now we have a passenger from RAc to whom we can book a ticket, 
            //so book the cancelled ticket to the RAC passenger
            Main.bookTicket(passengerFromRAC);
        }
    
    }
    
    
    public void printAvailableTickets() {
    	
    	System.out.println("Available Lower Berth : "+availableLowerBerth);
    	System.out.println("Available Upper Berth : "+availableUpperBerth);
    	System.out.println("Available Middle Berth : "+availableMiddleBerth);
    	System.out.println("Available RECs  : "+availableRecTickets);
    	System.out.println("Available Waiting List : "+availableWaitingTickets);
    	System.out.println("---------------------------");
    	
    }
    
    public void printPassengers() {
    	
    	if(passengers.size()==0) {
    		System.out.println("No Passenger Details!");
    		System.out.println("----------------------");
    		return;
    	}
    	for(Passenger p : passengers.values()) {
    		System.out.println("Passenger Id : "+p.passengerId);
    		System.out.println(" Name : "+p.name);
    		System.out.println(" Age : "+p.age);
    		System.out.println(" Status : "+ p.number + p.alloted);
    		System.out.println("---------------------");
    		
    	}
    	
    }
    
}
