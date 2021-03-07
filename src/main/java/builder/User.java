package builder;

import java.time.LocalDate;

public class User {
    private String login;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private User(String login, String email){
        this.login = login;
        this.email = email;
    }

    private User(String login, String email, LocalDate birthDate){
        this(login, email);
        this.birthDate = birthDate;
    }

    private User(String login, String email, LocalDate birthDate, String firstName, String lastName){
        this(login, email, birthDate);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static RequireLogin builder(){
        return User.Builder.builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
    interface RequireLogin{
        Builder login(String login);
    }
    public static class Builder{
        private String login;
        private String email;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;

        private Builder(){
        }

        private static RequireLogin builder(){
            return l -> {
                Builder builder= new Builder();
                builder.login = l;
                return builder;
            } ;
        }

        public Builder login(String login){
            this.login = login;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder birthDate(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }
        //TODO zdefiniować metody dla firstName i lastName

        public User build(){
            return new User(login, email, birthDate, firstName, lastName);
        }
    }
}

