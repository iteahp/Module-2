import java.util.Comparator;

public class Human  {
    private String name;
    private int age;
    private int id ;
    static int idNumber=0;

    public Human() {
    }

    public Human(String name, int age) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return
                "id = " +id +", name= '" + name + '\'' +
                ", age= " + age
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
