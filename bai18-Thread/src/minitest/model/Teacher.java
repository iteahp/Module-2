package minitest.model;

public class Teacher extends Human{
    private float salary;

    public Teacher() {
    }

    public Teacher(float salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                " , salary=" + salary +
                '}';
    }
}
