package codegym_management.model;

public class Teacher {
    private static final byte TEACHER = 2;
    private int id;
    private String name;
    private String birthday;
    private String gender;
    private String subject;

    public Teacher(int id, String name, String birthday, String gender, String subject) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getSubject() {
        return subject;
    }

    public static byte getTarget() {
        return TEACHER;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
