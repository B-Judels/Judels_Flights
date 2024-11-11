package Classes;

import java.util.ArrayList;

public class Customer extends User {
    private boolean previousPassenger;

    public Customer(String username, String password, int id, String name, String surname, int age, String email, boolean previousPassenger) {
        super(username, password, id, name, surname, age, email);
        this.previousPassenger = previousPassenger;
    }

    public boolean isPreviousPassenger() {
        return previousPassenger;
    }

    public void setPreviousPassenger(boolean previousPassenger) {
        this.previousPassenger = previousPassenger;
    }
}
