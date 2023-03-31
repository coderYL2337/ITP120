//ITP120 Airline assignment Oct 26 AirlineSchedule.java by Yan Lu
public class AirlineSchedule
{

   Flights[] flights = new Flights[4];
   DomesticFlights dFlight1 = new DomesticFlights("New York", "Boston",1000);
   DomesticFlights dFlight2 = new DomesticFlights("San Francisco", "Los Angelos", 1323);
   InternationalFlights iFlight1 = new InternationalFlights( "Washington DC","Toyko", 19000,"Japan");
   InternationalFlights iFlight2 = new InternationalFlights("Dallas","Toronto", 1900,"Canada");
   
   public AirlineSchedule(){
   flights[0] = dFlight1;
   flights[1] = dFlight2;
   flights[2] = iFlight1;
   flights[3] = iFlight2;}
   
   public void listDomestic(){
   int dCount = 0;
   for(int i=0;i<flights.length;i++){
   if(flights[i].getClass().getName().equals("DomesticFlights"))
   {System.out.println(flights[i].toString());
   dCount++;}
   }
    System.out.println("Total number of domestic flights: "+dCount);
    System.out.println();
    System.out.println();
   }
    public void listInternational(){
    int iCount = 0;
   for(int i=0;i<flights.length;i++){
   if(flights[i].getClass().getName().equals("InternationalFlights"))
   {System.out.println(flights[i].toString());
   iCount++;}
   }
   System.out.println("Total number of international flights: "+iCount);
 }

   }
  
 
 