package CMC.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room extends Base{
    private static int COUNT;
    private int id;
    private String name;
    private List<Student> studentList;

    public Room(String name, List<Student> studentList, LocalDate createDate, String createPerson, LocalDate updateDate, String updatePerson) {
        super(createDate, createPerson, updateDate, updatePerson);
        this.id = ++COUNT;
        this.name = name;
        this.studentList = studentList;
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
