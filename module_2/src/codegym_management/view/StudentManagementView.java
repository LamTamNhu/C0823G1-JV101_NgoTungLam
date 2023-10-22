package codegym_management.view;


import codegym_management.controller.Controller;
import codegym_management.model.Student;
import codegym_management.model.Teacher;

import java.util.Scanner;

public class StudentManagementView {

    public static void main(String[] args) {
        Controller controller = new Controller();

        do {
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Xem danh sách.\n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Xóa học viên. \n" +
                    "4. Thoát chương trình");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (checkTarget() == Student.getTarget()) {
                        controller.showList(Student.getTarget());
                    } else {
                        controller.showList(Teacher.getTarget());
                    }
                    break;
                case 2:
                    if (checkTarget() == Student.getTarget()) {
                        controller.addToList(Student.getTarget());
                    } else {
                        controller.addToList(Teacher.getTarget());
                    }
                    break;
                case 3:
                    if (checkTarget() == Student.getTarget()) {
                        controller.removeFromList(Student.getTarget());
                    } else {
                        controller.removeFromList(Teacher.getTarget());
                    }
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        } while (true);

    }

    private static byte checkTarget() {
        System.out.println("Vui lòng chọn giáo viên hay học sinh:\n" +
                "1. Học sinh\n" +
                "2. Giáo viên");
        Scanner scanner = new Scanner(System.in);
        return Byte.parseByte(scanner.nextLine());
    }
}
