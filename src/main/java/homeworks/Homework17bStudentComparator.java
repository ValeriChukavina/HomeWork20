package homeworks;

import java.util.ArrayList;

public class Homework17bStudentComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ivanov", 20)); //i 0
        students.add(new Student("Petrov", 30)); //i 1
        students.add(new Student("Sidorov", 27)); //i 2
        students.add(new Student("Fedorov", 23));
        students.add(new Student("Makarov", 18));

        students.sort(new StudentCamparator());

        for (Student std : students) {
            System.out.println(std.toString());
        }
    }
}
