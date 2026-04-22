package Questions;
interface Bookable{
    void bookTickets(String customerName,int numberofSeats) throws SeatsNotAvailableException;
}
class SeatsNotAvailableException extends Exception{
    SeatsNotAvailableException(String m){
        super(m);
    }
}
class CinemaScreen implements Bookable{
    int screenNumber;
    String movieName;
    int totalSeats;
    int availableSeats;
    public void bookTickets (String customerName, int numberofSeats) throws SeatsNotAvailableException{
        if(numberofSeats>availableSeats) {throw new SeatsNotAvailableException("Booking failed for "+customerName+" as mentioned number of seats are not available");}
        else{
            System.out.println("Booking confirmed for "+customerName+" on Screen "+screenNumber+" ("+movieName+"). Seats booked = "+numberofSeats);
            availableSeats=availableSeats-numberofSeats;
        }
    }
    void display(){
        System.out.println("Screen "+screenNumber+" - Movie: "+movieName+" | Total Seats: "+totalSeats+" | "+"Available Seats: "+availableSeats);
    }
}
class ScreenOne extends CinemaScreen{
    ScreenOne(String s, int n){
        movieName=s;
        screenNumber=1;
        availableSeats=n;
        totalSeats=n;
    }
}
class ScreenTwo extends CinemaScreen{
    ScreenTwo(String s, int n){
        movieName=s;
        screenNumber=2;
        availableSeats=n;
        totalSeats=n;
    }
}
public class Main2 {
    public static void main(String[] args){
        ScreenOne s1=new ScreenOne("Avatar",100);
        ScreenTwo s2=new ScreenTwo("Titanic",80);
        s1.display();
        s2.display();
        try{
        s1.bookTickets("Alice", 10);
        s2.bookTickets("John", 30);
        s1.bookTickets("Tom", 100);
        }catch(SeatsNotAvailableException e){
            System.out.println(e.getMessage());
        }
        s1.display();
        s2.display();
    }
}
