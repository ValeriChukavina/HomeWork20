package homeworks.hw17;

import java.util.ArrayList;

public class Homework17bStudentComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivanov", 20));
        students.add(new Student("Petrov", 30));
        students.add(new Student("Sidorov", 27));
        students.add(new Student("Fedorov", 23));
        students.add(new Student("Makarov", 18));

        students.sort(new StudentCamparator());

        for (Student std : students) {
            System.out.println(std.toString());
        }
    }
}
