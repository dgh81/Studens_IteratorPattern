package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentLibrary implements StudentCollection {
    protected List<Student> students;

    public StudentLibrary() {
        super();
        students = new ArrayList<Student>();

    }

    public boolean addStudent(int ID, String name, int age, String level, String className) {
        Student student = new Student(ID, name, age, level, className);
        return students.add(student);
    }

    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

}
