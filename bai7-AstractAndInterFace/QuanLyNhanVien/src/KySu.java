public class KySu extends NhanVien {
    private double coefficientsSalary;

    public KySu() {
    }

    public KySu(double coefficientsSalary, String name, String address, int age, int salary, int workingDay) {
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
                "coefficientsSalary=" + coefficientsSalary+" , " +super.toString()+
                '}';
    }
}
