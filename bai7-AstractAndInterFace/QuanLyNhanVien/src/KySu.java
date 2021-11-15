public class KySu extends NhanVien {
    private double coefficientsSalary;

    public KySu() {
    }

    public KySu( String name, String address, int age, int salary, int workingDay,double coefficientsSalary) {
        super(name, address, age, salary, workingDay);
        this.coefficientsSalary =coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }


    public double payRoll() {
        return (double) getSalary() * (double) getWorkingDay() * getCoefficientsSalary();
    }

    @Override
    public String toString() {
        return "KySu{" +
                 super.toString()+" , coefficientsSalary=" + coefficientsSalary+
                '}';
    }
}
