package dz;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SchoolClass {
    private final String name;
    private ArrayList<Student> students = new ArrayList<>();

    public SchoolClass(String name) {
        this.name = name;
    }

    public SchoolClass(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public double getMean() {
        return students.stream().map(Student::getMean).reduce(0.0, Double::sum) / students.size();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Stream<Student> getStudentsStream() {
        return students.stream();
    }

    public long getStudentsCount() {
        return students.size();
    }
}
