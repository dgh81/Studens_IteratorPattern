package com.company;

public class Student {

    private int ID;
    private String name;
    private int age;
    private String level;
    private String className;

    public Student() {
        super();
    }

    public Student(int ID, String name, int age, String level, String className) {
        this();
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.level = level;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
