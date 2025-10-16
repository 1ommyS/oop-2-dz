package dz;

public class Main {
    public static void main(String[] args) {
        var school = new School("МАËВНИК");

        var vanya = new Student("Иван Березуцкий");
        var zayka = new Student("Валентин Евгеньевич");

        vanya.addMark(5, "ЭМЭЛИРОВАНИЕ");
        zayka.addMark(new Mark(2, "Фундаментальная информатика"));

        var schoolClass = new SchoolClass("11Б");
        schoolClass.addStudent(vanya);

        var schoolClass2 = new SchoolClass("11А");
        schoolClass2.addStudent(zayka);

        school.addClass(schoolClass);
        school.addClass(schoolClass2);

        System.out.printf("Средняя оценка пупсика: %.2f%n", vanya.getMean());
        System.out.printf("Средняя оценка класса: %.2f%n", schoolClass.getMean());
        System.out.printf("Средняя оценка школы: %.2f%n", school.getMean());
        System.out.printf("Лучший в школе: %s%n", school.getBestStudent());
    }
}
