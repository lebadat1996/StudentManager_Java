package Person;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String DateOfBirth;
    private String Address;

    public Person() {

    }

    public Person(String name, String gender, String Address, String DatOfBirth) {
        this.name = name;
        this.gender = gender;
        this.Address = Address;
        this.DateOfBirth = DatOfBirth;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void enterInFo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter name: ");
        while (true) {
            String NameInput = scanner.nextLine();
            boolean check = setName(NameInput);
            if (check) {
                break;
            }
        }
        System.out.print("Enter gender: ");
        this.gender = scanner.nextLine();
        System.out.print("Enter Address: ");
        this.Address = scanner.nextLine();
        System.out.print("Enter DateOfBirth: ");
        this.DateOfBirth = scanner.nextLine();
    }

    public void ShowInFor() {
        System.out.printf("%-15s %-15s %-15s %-15s", "\n" + name, gender, Address, DateOfBirth);
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name != null && name.length() == 7) {
            this.name = name;
            return true;
        } else {
            System.out.println("Confluent !!");
            return false;
        }
    }
}
