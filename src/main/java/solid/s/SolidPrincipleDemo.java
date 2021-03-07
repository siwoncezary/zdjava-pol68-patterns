package solid.s;

public class SolidPrincipleDemo {
    public static void main(String[] args) {
        //Klasa Employee nie spełnia zasady, bo metoda getUsername() zajmuje się szczegółami budowy maila
        Employee employee = new Employee("Adam","Nowak","adam@firma.pl");
        System.out.println(employee.getUsername());
        SolidEmployee solidEmployee = new SolidEmployee("Adam",
                "Nowak",
                new EmailAddress("adam@firma.pl")
        );

        EmailAddress address = solidEmployee.getEmail();

    }
}
