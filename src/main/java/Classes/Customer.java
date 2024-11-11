package Classes;

import java.util.ArrayList;

public class Customer extends User {

    public Customer(String username, String password, String id, String name, String surname, int age, String email, String role) {
        super(username, password, id, name, surname, age, email, role);
        role = "Customer";
    }
}
