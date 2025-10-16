package dz;

import java.util.ArrayList;

public class School {
    private final String name;
    private ArrayList<SchoolClass> classes = new ArrayList<>();

    public School(String name, ArrayList<SchoolClass> classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public School(String name) {
        this.name = name;
    }

    public double getMean() {
        return classes.stream()
                .flatMap(SchoolClass::getStudentsStream)
                .mapToDouble(Student::getMean)
                .reduce(0.0, Double::sum)
                / classes.stream().map(SchoolClass::getStudentsCount).reduce(0L, Long::sum);
    }

    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    public Student getBestStudent() {
        if (classes.isEmpty()) throw new IllegalStateException("No students in this School");
        return classes.stream()
                .flatMap(SchoolClass::getStudentsStream)
                .max(Student::compareTo).orElse(null);
    }
}
