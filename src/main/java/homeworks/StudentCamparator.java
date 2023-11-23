package homeworks;

import java.util.Comparator;

public class StudentCamparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.averageGrade == o2.averageGrade) {
            return 0;
        } else if (o1.averageGrade < o2.averageGrade) {
            return 1;
        } else {
            return -1;
        }
    }
}
