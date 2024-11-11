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

class Johannesburg extends Flight{
    public Johannesburg(int flightNumer, String Destination, int departureTime, int seats) {
        super(flightNumer, Destination, departureTime, seats);
        flightNumer = 1234;
        Destination = "Johannesburg";
        departureTime = 8;
        seats = 40;
    }
}

class CapeTown extends Flight{
    public CapeTown(int flightNumer, String Destination, int departureTime, int seats) {
        super(flightNumer, Destination, departureTime, seats);
        flightNumer = 3645;
        Destination = "CapeTown";
        departureTime = 18;
        seats = 80;
    }
}

class George extends Flight{
    public George(int flightNumer, String Destination, int departureTime, int seats) {
        super(flightNumer, Destination, departureTime, seats);
        flightNumer = 7896;
        Destination = "George";
        departureTime = 16;
        seats = 40;
    }
}

class Bloemfontein extends Flight{
    public Bloemfontein(int flightNumer, String Destination, int departureTime, int seats) {
        super(flightNumer, Destination, departureTime, seats);
        flightNumer = 2696;
        Destination = "Bloemfontein";
        departureTime = 11;
        seats = 40;
    }
}
