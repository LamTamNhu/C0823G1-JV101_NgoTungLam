package codegym_management.model;

public class Student {
    private static final byte STUDENT = 1;
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private String classroom;
    private int grade;

    public Student(int id, String name, String birthday, String gender, String classroom, int grade) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.classroom = classroom;
        this.grade = grade;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static byte getTarget(){
        return STUDENT;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", classroom='" + classroom + '\'' +
                ", grade=" + grade +
                '}';
    }
}
