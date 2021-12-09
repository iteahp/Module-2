package minitest.controller.model;

import java.io.Serializable;

public class Students implements Serializable {
    private String studentCode;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double score;

    public Students(String studentCode, String name, int age, String gender, String address, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.score = score;
    }

    public Students() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return
                 studentCode  +
                "," + name +
                "," + age +
                "," + gender +
                "," + address +
                "," + score
                ;
    }
}
