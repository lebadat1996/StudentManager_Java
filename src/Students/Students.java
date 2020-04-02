package Students;

import Person.Person;

import java.util.Scanner;

public class Students extends Person {
    private int id;
    private String StudentCode;
    private float GPA;
    private String email;

    public Students() {

    }

    public Students(String name, String gender, String Address, String DatOfBirth, int id, String studentCode, float GPA, String email) {
        super(name, gender, Address, DatOfBirth);
        StudentCode = studentCode;
        this.GPA = GPA;
        this.email = email;
        this.id = id;
    }

    @Override
    public void enterInFo() {
        Scanner scanner = new Scanner(System.in);
        super.enterInFo();
        System.out.print("Enter ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter StudentCode: ");
        this.StudentCode = scanner.nextLine();
        System.out.print("Enter GPA: ");
        while (true) {
            float markInput = Float.parseFloat(scanner.nextLine());
            boolean check = setGPA(markInput);
            if (check) {
                break;
            }
        }

        System.out.print("Enter Email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public void ShowInFor() {
        super.ShowInFor();
        System.out.printf("%-15d %-15s %-15.2f %-15s", id, StudentCode, GPA, email);
        if (this.GPA > 8) {
            System.out.print("   You get a scholarship !!!!!!!");
        } else {
            System.out.print("   You don't scholarship !!!!!!!");
        }

    }

    public double getGPA() {
        return GPA;
    }

    public boolean setGPA(float GPA) {
        if (GPA >= 0 && GPA <= 10) {
            this.GPA = GPA;
            return true;
        } else {
            System.out.println("Confluent !!");
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
