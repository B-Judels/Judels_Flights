package Classes;

public class Booking {
    private String bookingID;
    private String flightID;
    private String passengerName;
    private String PassengerSurname;
    private String email;
    private String passengerID;
    private int seatNumber;

    public Booking(String bookingID, String flightID,  String passengerName, String PassengerSurname, String email, String passengerID, int seatNumber) {
        this.bookingID = bookingID;
        this.flightID = flightID;
        this.passengerName = passengerName;
        this.PassengerSurname = PassengerSurname;
        this.email = email;
        this.passengerID = passengerID;
        this.seatNumber = seatNumber;
    }

    public String getBookingID() {
        return bookingID;
    }
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerSurname() {
        return PassengerSurname;
    }

    public void setPassengerSurname(String PassengerSurname) {
        this.PassengerSurname = PassengerSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
}
