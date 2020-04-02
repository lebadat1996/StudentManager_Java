package Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.enterInFo();
        System.out.printf("%-20s %-20s %-20s %-20s","Name", "Gender", "Address", "DateOfBirth");
        person.ShowInFor();

    }
}
