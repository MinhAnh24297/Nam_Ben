package CMC.service;

import CMC.DAO.Connection;
import CMC.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    Connection connection = new Connection();
    public void createStudent(){
        System.out.println("Mời bạn nhập tên sv");
        String studentName = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi");
        int studentAge = scanner.nextInt();
        System.out.println("Mời bạn nhập địa chỉ");
        scanner.nextLine();
        String studentAddress = scanner.nextLine();
        System.out.println("Mời bạn nhập tên của bạn");
        String createtName = scanner.nextLine().trim();
        Student student = new Student(studentName, studentAge, studentAddress, LocalDate.now(), createtName, null, null);
        connection.createStudent(student);
    }

    public void getStudent() {
        connection.getStudent();
    }
}
