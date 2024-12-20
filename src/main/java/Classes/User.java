package Classes;

public class User {
    // logins
    private String username;
    private String password;
    //other personal info
    private String id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String role;

    public User(String username, String password,String id, String name, String surname, int age, String email, String role) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

