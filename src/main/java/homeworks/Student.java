package homeworks;

public class Student {
    String name;
    int averageGrade;

    public Student(String name, int avg) {
        this.averageGrade = avg;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " " + this.averageGrade;
    }

}
