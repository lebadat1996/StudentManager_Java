package StudentManager;

import Students.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Students> studentsList = new ArrayList<Students>();
        int selection;
        do {
            System.out.print("\n=====Quan LY SINH VIEN=====");
            System.out.print("\n1. Nhap so sinh vien");
            System.out.print("\n2. Hien thi thong tin sinh vien");
            System.out.print("\n3. Tim Kiem Sinh Vien theo Ten");
            System.out.print("\n4. Xoa Sinh vien ID");
            System.out.print("\n5. Them Sinh Vien");
            System.out.print("\n6. Sua thong tin sinh vien");
            System.out.print("\n7. Hien thi sinh vien duoc hoc bong");
            System.out.print("\n8. Hien thi cac ban nu");
            System.out.print("\nselection: ");
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.print("Number Student: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print("\nStudents: " + i + ": ");
                        Students std = new Students();
                        std.enterInFo();
                        studentsList.add(std);
                    }
                    break;
                case 2:
                    System.out.printf("%-14s %-14s %-15s %-14s %-14s %-16s %-15s %-13s"
                            , "Name", "Gender", "Address", "DateOfBirth", "ID", "StudentCode", "GPA", "EMail");
                    for (Students students : studentsList) {
                        students.ShowInFor();
                    }
                    break;
                case 3:
                    System.out.println("Enter Student Find: ");
                    String name = scanner.next();
                    for (Students students : studentsList) {
                        if (students.getName().equals(name)) {
                            students.ShowInFor();
                        } else {
                            System.out.println("No find Students in List");
                        }
                    }
                    break;
                case 4:
                    Students students = null;
                    System.out.print("Enter id Student remove: ");
                    int id = scanner.nextInt();
                    int size = studentsList.size();
                    for (int i = 0; i < size; i++) {
                        if (studentsList.get(i).getId() == id) {
                            students = studentsList.get(i);
                            break;
                        }
                    }
                    if (students != null) {
                        studentsList.remove(students);
                    }
                    break;
                case 5:
                    int num = scanner.nextInt();
                    for (int i = 0; i < num; i++) {
                        Students student = new Students();
                        student.enterInFo();
                        studentsList.add(student);
                    }

                    break;
                case 6:
                    Students students1 = null;
                    System.out.print("Enter id Student edit: ");
                    int id1 = scanner.nextInt();
                    int size1 = studentsList.size();
                    for (int i = 0; i < size1; i++) {
                        if (studentsList.get(i).getId() == id1) {
                            students1 = studentsList.get(i);
                            break;
                        }
                    }
                    if (students1 != null) {
                        students1.setName("leBaDat");
                        students1.setDateOfBirth("02061996");
                    }
                    break;
                case 7:
                    int count = 0;
                    int GPA = 8;
                    for (int i = 0; i < studentsList.size(); i++) {
                        if (studentsList.get(i).getGPA() > GPA) {
                            count++;
                            studentsList.get(i).ShowInFor();
                        }
                    }
                    break;
                case 8:
                    String gender = "nu";
                    for (int i = 0; i < studentsList.size(); i++) {
                        if (studentsList.get(i).getGender().equals(gender)) {
                            studentsList.get(i).ShowInFor();
                        }
                    }
                    break;
                case 9:
                    System.exit(1);

                default:
                    System.err.print("xin moi nhap lai\n");


            }

        } while (selection != 10);
    }
}
