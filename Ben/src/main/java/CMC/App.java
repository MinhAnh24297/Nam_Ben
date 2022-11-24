package CMC;

import CMC.service.StudentService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chào mừng bạn tới với phần mềm, mời chọn option");
        while (true) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    studentService.createStudent();
                    break;
                case 2:
                    studentService.getStudent();
                    break;
                case 3:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình. Hẹn gặp lại!");
                    return;
            }
    }
}}
