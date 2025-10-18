package school;

import java.util.Arrays;

public class School {
    private SchoolClass[] schoolClasses;
    private int size;

    public School(int cLassesCount) {
        if (cLassesCount <= 0) {
            System.out.println("Неверно указано количество классов");
            return;
        }
        this.schoolClasses = new SchoolClass[cLassesCount];
        this.size = 0;
    }

    public SchoolClass[] getSchoolClasses() {
        return Arrays.copyOf(schoolClasses, size);
    }

    public int getSize() {
        return size;
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        if (size == schoolClasses.length) {
            System.out.println("Класс не может быть добавлен, " +
                               "максимальное количество классов - " + schoolClasses.length);
            return;
        }
        schoolClasses[size++] = schoolClass;
    }

    public SchoolClass findByName(String name) {
        for (SchoolClass schoolClass : getSchoolClasses()) {
            if (name.equalsIgnoreCase(schoolClass.getName())) {
                return schoolClass;
            }
        }
        return null;
    }

    public double average() {
        double averageSchoolMark = 0;
        for (SchoolClass schoolClass : getSchoolClasses()) {
            averageSchoolMark += schoolClass.average();
        }
        return averageSchoolMark / size;
    }

    public Student bestStudent() {
        Student bestStudentOfSchool = null;
        double averageBySchool = -1;
        for (SchoolClass schoolClass : getSchoolClasses()) {
            Student bestStudentOfClass = schoolClass.findBestStudent();
            if (bestStudentOfClass == null) continue;
            double bestAverageByClass = bestStudentOfClass.average();
            if (bestAverageByClass > averageBySchool) {
                averageBySchool = bestAverageByClass;
                bestStudentOfSchool = bestStudentOfClass;
            }
        }
        return bestStudentOfSchool;
    }

    public String toString() {
        return String.format(
                "количество классов в школе - %d;", size);
    }
}