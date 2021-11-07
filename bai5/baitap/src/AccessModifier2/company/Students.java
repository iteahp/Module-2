package com.company;

public class Students {
    private String name = "Jone";
    private  String classes = "C02";
    public  Students(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

     void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
