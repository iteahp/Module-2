public class CongNhan extends NhanVien{
    public CongNhan() {
    }

    public CongNhan(String name, String address, int age, int salary, int workingDay) {
        super(name, address, age, salary, workingDay);
    }


    public double payRoll() {
        return (double) getSalary() * (double) getWorkingDay();
    }

    @Override
    public String toString() {
        return "CongNhan{" +super.toString()+"}";
    }
}
