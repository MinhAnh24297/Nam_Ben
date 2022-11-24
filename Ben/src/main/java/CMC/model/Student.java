package CMC.model;

import java.time.LocalDate;

public class Student extends Base{
    private static int COUNT;
    private int id;
    private String name;
    private int age;
    private String address;


    public Student(String name, int age, String address, LocalDate createDate, String createPerson, LocalDate updateDate, String updatePerson) {
        super(createDate, createPerson, updateDate, updatePerson);
        this.id = ++COUNT;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void existedStudent() {
        Student student1 = new Student("Minh Anh", 25, "Hà Nội", LocalDate.of(2022, 10, 20), "Việt Anh", LocalDate.of(2022, 11, 23), "Mai Anh");
        Student student2 = new Student("Phương Anh", 25, "Nam Định", LocalDate.of(2021, 4, 25), "Mai Anh", LocalDate.of(2022, 1, 20), "Việt Anh");
        Student student3 = new Student("Lan Anh", 21, "Ba Vì", LocalDate.of(2020, 6, 13), "Việt Anh", LocalDate.of(2022, 7, 13), "Mai Anh");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
