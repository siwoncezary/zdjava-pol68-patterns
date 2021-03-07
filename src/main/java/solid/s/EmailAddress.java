package solid.s;
/*
    Klasa zawiera logikę i odpowiedialność za sprawdzenia poprawności i uzyskiwanie
    informacji z email'a
 */
public class EmailAddress {
    final String email;

    public EmailAddress(String address) {
        this.email = address;
    }

    public String getUsername(){
        return email.substring(0, email.indexOf('@'));
    }

    public String getEmail() {
        return email;
    }
}
