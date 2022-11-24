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

        System.out.println("Chào mừng bạn tới với phần mềm");
        while (true) {
            System.out.println("Có 2 option");
            System.out.println("1. Thêm thông tin sinh viên");
            System.out.println("2. Lấy ra danh sách sinh viên");
            System.out.println("3. Kết thúc chương trình");
            System.out.println("Mời chọn option");
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
