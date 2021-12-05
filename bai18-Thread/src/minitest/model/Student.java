package minitest.model;

public class Student extends Human{
    private float avg;

    public Student() {

    }

    public Student(float avg) {
        this.avg = avg;
    }

    public Student(String name, int age, float avg) {
        super(name, age);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", avg=" + avg +
                '}';
    }
}
