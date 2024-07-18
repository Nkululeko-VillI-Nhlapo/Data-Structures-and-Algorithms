
import java.util.Date;

public class FlightNode {
    
    //Attributes
    private String registration_num; // flight registration number
    private Date arrival_date; // landing date and time for the flight 
    
    public FlightNode() {
                                       // default constructor
    }
    
    public FlightNode(String registr_no, Date arrival_date) {//this a loaded constructor
        this.registration_num = registr_no;   
        this.arrival_date = arrival_date;
    }
    
    //accessor methods to get information
    public String getRegistration_num() {
        return registration_num;
    }
    
    public Date getArrival_date() {
        return arrival_date;
    }
    
    //mutator methods to update info 
    public void setRegistration_num(String reg_no) {
        this.registration_num = reg_no;
    }
    
    public void setArrival_date(Date arrival_date) {
        this.arrival_date = arrival_date;
    }
    
    // toString() method returns string objects
    public String toString() {
        return "Flight registration no.: " + registration_num + "\n" +
               "Arrival date: " + arrival_date;
    }
}