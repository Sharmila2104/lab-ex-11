/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbook;

/**
 *
 * @author sharmila
 */
public class Ticketbook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
    TicketBooking obj=new TicketBooking();
           
           Thread thread1=new Thread(obj,"Passenger1 ");
           Thread thread2=new Thread(obj,"Passenger2 ");
           
           thread1.start();
           thread2.start();
    }
    
}
}
class TicketBooking implements Runnable{
    int ticketsAvailable=50;
    
    @Override
    public void run(){
           
           System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
           if(ticketsAvailable>0){
                  System.out.println("Booking ticket for : "+Thread.currentThread().getName());
                  
                  try{
                        Thread.sleep(1000); 
                  }catch(Exception e){}
                    
                  ticketsAvailable--;
                  System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName());
                 System.out.println("currently ticketsAvailable = "+ticketsAvailable); 
           }
           else{
                  System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
           }
            
           
    } 
}

        

