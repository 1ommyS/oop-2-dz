package dz;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final String name;
    private List<SchoolClass> classes = new ArrayList<>();

    public School(String name, ArrayList<SchoolClass> classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public List<SchoolClass> getClasses() {
        return classes;
    }

    public School(String name) {
        this.name = name;
    }

    public double getMean() {
        return classes.stream()
                .flatMap(schoolClass -> schoolClass.getStudents().stream())
                .reduce(0.0, (sum, student) -> sum + student.getMean(), Double::sum)
                / classes.stream()
                .reduce(0L, (sum, schoolClass) -> sum + schoolClass.getStudentsCount(), Long::sum);
    }

    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    public Student getBestStudent() throws IllegalStateException {
        return classes.stream()
                .flatMap(schoolClass -> schoolClass.getStudents().stream())
                .max(Student::compareTo).orElseThrow(() -> new IllegalStateException("Нет студентов в школе"));
    }
}
