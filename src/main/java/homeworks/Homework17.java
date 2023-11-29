package homeworks;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Homework17 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> studentsSorted = new ArrayList<>();

        students.add(new Student("Ivanov", 20)); //i 0
        students.add(new Student("Petrov", 30)); //i 1
        students.add(new Student("Sidorov", 27)); //i 2
        students.add(new Student("Fedorov", 23));
        students.add(new Student("Makarov", 18));

        Student st = new Student("Oleg", 30);
        System.out.println(st.toString());

        int maxValue = 0;
        int maxIndex = 0;
        while (students.size() > 0) {
            maxIndex = 0;
            maxValue = students.get(0).averageGrade;
            for (int i = 1; i < students.size(); i++) {
                if (maxValue < students.get(i).averageGrade) {
                    maxIndex = i;
                    maxValue = students.get(i).averageGrade;
                }
            }
            studentsSorted.add(students.get(maxIndex));
            students.remove(maxIndex);
        }

//        studentsSorted.forEach(x -> System.out.print(x.averageGrade + " "));

//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    isSorted = false;
//                    buf = arr[i];
//                    arr[i] = arr[i + 1];
//                    brr[i] = arr[i + 1]; //
//                    arr[i + 1] = buf;
//                    brr[i + 1] = buf;
//                }
//            }
//        }
//            for (int ar: brr) {
//                System.out.print(ar);
//            }



    }
}
