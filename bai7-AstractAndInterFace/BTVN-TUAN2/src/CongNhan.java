public class CongNhan extends NhanVien{
    @Override
    public double getSumSalary() {
        return super.getSalary()*super.getWorkingDay();
    }

    public CongNhan(int id, String name, int age, String address, double workingDay, double salary) {
        super(id, name, age, address, workingDay, salary);
    }

    @Override
    public String toString() {
        return "Công nhân { "+ super.toString() + " }";
    }
}
