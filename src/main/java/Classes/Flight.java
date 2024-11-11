package Classes;

public class Flight {
    private String flightID;
    private int flightNumer;
    private String Destination;
    private int departureTime;
    private int seats;

    public Flight(int flightNumer, String Destination, int departureTime, int seats) {
        this.flightNumer = flightNumer;
        this.Destination = Destination;
        this.departureTime = departureTime;
        this.seats = seats;
    }

    public int getFlightNumer() {
        return flightNumer;
    }

    public void setFlightNumer(int flightNumer) {
        this.flightNumer = flightNumer;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }


    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
