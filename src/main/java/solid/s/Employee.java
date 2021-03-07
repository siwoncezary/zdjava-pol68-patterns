package solid.s;

public class Employee {
    final String firstName;
    final String lastName;
    final String email;

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername(){
        return email.substring(0, email.indexOf('@'));
    }
}
