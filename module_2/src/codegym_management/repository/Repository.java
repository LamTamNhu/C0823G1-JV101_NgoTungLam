package codegym_management.repository;

import codegym_management.model.Student;
import codegym_management.model.Teacher;

import java.util.ArrayList;

public class Repository implements IRepository {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        students.add(new Student(1, "John", "16/06/2000", "male", "C08", 8));
        students.add(new Student(2, "Smith", "11/06/2000", "male", "C08", 7));
        students.add(new Student(3, "Brad", "16/08/1995", "male", "C08", 3));
        students.add(new Student(4, "Chad", "01/10/2001", "male", "C08", 5));
        students.add(new Student(5, "Bao", "02/03/1998", "female", "C08", 6));

        teachers.add(new Teacher(5, "Don", "02/03/1980", "male", "A1"));
        teachers.add(new Teacher(5, "Anny", "02/03/1995", "female", "A2"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public void showList(byte target) {
        if (target == Student.getTarget()) {
            for (Student s : students) {
                System.out.println(s);
            }
        } else if (target == Teacher.getTarget()) {
            for (Teacher t : teachers) {
                System.out.println(t);
            }
        }
    }
}
