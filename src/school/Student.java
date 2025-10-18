package school;

import java.util.Arrays;

public class Student {
    private Mark[] marks;
    private String fullName;
    private int size;

    Student(String fullName, int marksCapacity) {
        this.fullName = fullName;
        this.marks = new Mark[marksCapacity];
        this.size = 0;
    }

    public Mark[] getMarks() {
        return Arrays.copyOf(marks, size);
    }

    public int getSize() {
        return size;
    }

    public String getFullName() {
        return fullName;
    }

    public void addMark(Mark mark) {
        if (size == marks.length) {
            System.out.println("Оценка не может быть добавлена, максимальное количество оценок - " + marks.length);
            return;
        }
        marks[size++] = mark;
    }


    public int marksCount() {
        return size;
    }

    public boolean isMarksFull() {
        return (size == marks.length);
    }

    public double average() {
        if (size == 0) return 0.0;
        int sumMarks = 0;
        for (int i = 0; i < size; i++) {
            sumMarks += marks[i].getValue();
        }
        return (double) sumMarks / size;
    }

    public String toString() {
        return String.format(
                "студент - %s; средняя оценка - %.2f", fullName, average());
    }
}