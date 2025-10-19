package school;

import java.util.Arrays;

public class SchoolClass {
    private Student[] students;
    private String name;
    private int size;

    public SchoolClass(int studentCount, String nameClass) {
        if (studentCount <= 0) {
            System.out.println("Неверно указано количество учеников");
            return;
        }
        this.students = new Student[studentCount];
        this.name = nameClass;
        this.size = 0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, size);
    }

    public void addStudent(Student student) {
        if (size == students.length) {
            System.out.println(
                    "Студент не может быть добавлен, " +
                    "максимальное количество студентов - " + students.length);
            return;
        }
        students[size++] = student;
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Неверный индекс студента");
            return null;
        }
        return students[index];
    }

    public Student findByName(String fullName) {
        for (Student student : getStudents()) {
            if (fullName.equalsIgnoreCase(student.getFullName())) {
                return student;
            }
        }
        return null;
    }

    public double average() {
        double sumOfAverages = 0;
        for (Student student : getStudents()) {
            sumOfAverages += student.average();
        }
        return sumOfAverages / size;
    }

    public Student findBestStudent() {
        Student bestStudent = null;
        double maxAverage = -1;
        for (Student student : getStudents()) {
            if (student.average() > maxAverage) {
                maxAverage = student.average();
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public String toString() {
        return String.format(
                "класс - %s; количество студентов - %d;", name, size);
    }
}