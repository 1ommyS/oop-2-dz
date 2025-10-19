package school;

public class Main {
    public static void main(String[] args) {
        School school = initialSchool();

        SchoolClass class10A = school.findByName("10А");
        SchoolClass class10B = school.findByName("10Б");

        Student petya = class10A.findByName("Петя");
        Student masha = class10A.findByName("Маша");
        Student dima = class10B.findByName("Дима");

        System.out.println("Средний балл Пети: " + petya.average());
        System.out.println("Средний балл Маши: " + masha.average());
        System.out.println("Средний балл Димы: " + dima.average());

        System.out.println("Средний балл класса 10А: " + class10A.average());
        System.out.println("Средний балл класса 10Б: " + class10B.average());

        System.out.println("Средний балл школы: " + school.average());

        System.out.println("Лучший студент класса 10А: " + class10A.findBestStudent());
        System.out.println("Лучший студент класса 10Б: " + class10B.findBestStudent());

        System.out.println("Лучший студент школы: " + school.bestStudent());

        System.out.println("Поиск несуществующего класса: " + school.findByName("11А"));
        System.out.println("Поиск несуществующего студента: " + class10A.findByName("Дмитрий"));

        SchoolClass emptyClass = new SchoolClass(3, "11В");
        school.addSchoolClass(emptyClass);
        System.out.println("Средний балл пустого класса: " + emptyClass.average());
        System.out.println("Лучший студент пустого класса: " + emptyClass.findBestStudent());

        Student noMarksStudent = new Student("Елена", 3);
        class10A.addStudent(noMarksStudent);
        System.out.println("Средний балл студента без оценок: " + noMarksStudent.average());
        System.out.println("Лучший студент класса с учеником без оценок: " + class10A.findBestStudent());
    }

    public static School initialSchool() {
        School school = new School(5);
        SchoolClass class10A = new SchoolClass(3, "10А");
        SchoolClass class10B = new SchoolClass(2, "10Б");
        Student petya = new Student("Петя", 5);
        petya.addMark(new Mark(5, "Математика"));
        petya.addMark(new Mark(4, "Физика"));
        Student masha = new Student("Маша", 5);
        masha.addMark(new Mark(3, "Математика"));
        masha.addMark(new Mark(4, "Физика"));
        masha.addMark(new Mark(5, "Химия"));
        Student dima = new Student("Дима", 3);
        dima.addMark(new Mark(4, "Математика"));
        dima.addMark(new Mark(4, "Физика"));
        class10A.addStudent(petya);
        class10A.addStudent(masha);
        class10B.addStudent(dima);
        school.addSchoolClass(class10A);
        school.addSchoolClass(class10B);
        return school;
    }
}