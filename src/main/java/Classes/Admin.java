package Classes;

public class Admin extends User {
    private boolean admin;

    public Admin(String username, String password, int id, String name, String surname, int age, String email, boolean admin) {
        super(username, password, id, name, surname, age, email);
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
