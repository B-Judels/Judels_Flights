package Classes;

public class Admin extends User {

    public Admin(String username, String password, String id, String name, String surname, int age, String email, String role) {
        super(username, password, id, name, surname, age, email, role);
        role = "Admin";
    }

}
