package dz;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private final String name;
    private List<Student> students = new ArrayList<>();

    public SchoolClass(String name) {
        this.name = name;
    }

    public SchoolClass(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public double getMean() {
        return students.stream()
                .reduce(0.0, (sum, student) -> sum + student.getMean(), Double::sum)
                / students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public long getStudentsCount() {
        return students.size();
    }
}
