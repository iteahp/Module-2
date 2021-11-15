public  class NhanVien {
    private int id ;
    private  String name;
    private String address;
    private int age ;
    private int salary;
    private int workingDay;
    private static int idNumber =0;
    public NhanVien() {
    }

    public NhanVien( String name,String address, int age,  int salary, int workingDay) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workingDay = workingDay;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workingDay=" + workingDay
                ;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        NhanVien.idNumber = idNumber;
    }
}
