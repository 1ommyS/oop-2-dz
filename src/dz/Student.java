package dz;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private final String name;
    private ArrayList<Mark> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Mark> marks) {
        this.name = name;
        this.marks = marks;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public void addMark(int value, String subjectName) {
        marks.add(new Mark(value, subjectName));
    }

    public double getMean() {
        return (double)marks.stream().mapToInt(Mark::getValue).sum() / marks.size();
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.getMean(), other.getMean());
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", getName(), getMean());
    }
}
