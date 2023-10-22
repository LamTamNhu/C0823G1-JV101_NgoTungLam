package codegym_management.service;

import codegym_management.model.Student;
import codegym_management.model.Teacher;
import codegym_management.repository.IRepository;
import codegym_management.repository.Repository;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Service implements IService {
    private final IRepository iRepository = new Repository();
    private final ArrayList<Student> students = Repository.getStudents();
    private final ArrayList<Teacher> teachers = Repository.getTeachers();
    private Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private String classroom;
    private int grade;
    private String subject;

    @Override
    public void addToList(byte target) {
        System.out.println("Nhập mã:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        birthday = scanner.nextLine();
        System.out.println("Nhập giới tính");
        gender = scanner.nextLine();
        if (target == Student.getTarget()) {
            System.out.println("Nhập lớp");
            classroom = scanner.nextLine();
            System.out.println("Nhập điểm số");
            grade = Integer.parseInt(scanner.nextLine());
            students.add(new Student(id, name, birthday, gender, classroom, grade));
        } else if (target == Teacher.getTarget()) {
            System.out.println("Nhập chuyên môn");
            subject = scanner.nextLine();
            teachers.add(new Teacher(id, name, birthday, gender, subject));
        }
    }

    @Override
    public void removeFromList(byte target) {
        System.out.println("Nhập mã cần xóa");
        id = Integer.parseInt(scanner.nextLine());
        if (target == Student.getTarget()) {
            for (Student s : students) {
                if (s.getId() == id) {
                    if (removeConfirm()) {
                        students.remove(s);
                        return;
                    } else return;
                }
            }
        } else if (target == Teacher.getTarget()) {
            for (Teacher t : teachers) {
                if (t.getId() == id) {
                    if (removeConfirm()) {
                        teachers.remove(t);
                        return;
                    } else return;
                }
            }
        }
        System.out.println("Không tìm thấy id!");
    }

    private boolean removeConfirm() {
        String confirm;
        do {
            System.out.println("Đã tìm thấy id, xác nhận xóa? Gõ 'Yes' hoặc 'No'");
            confirm = scanner.nextLine();
            if (Objects.equals(confirm, "Yes")) {
                return true;
            } else if (Objects.equals(confirm, "No")) {
                return false;
            } else {
                System.out.println("Nhập sai, mời gõ lại!");
            }
        } while (true);
    }

    @Override
    public void Edit(byte target) {

    }

    @Override
    public void showList(byte target) {
        iRepository.showList(target);
    }


}
