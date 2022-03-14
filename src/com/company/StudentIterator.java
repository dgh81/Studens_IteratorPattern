package com.company;

import java.util.Iterator;


public class StudentIterator implements Iterator<Student> {

    protected Student[] students;
    protected int currentStudent = 0;

    public StudentIterator(Student[] students) {
        this.students = students;

    }

    @Override
    public boolean hasNext() {
        return (currentStudent < students.length && students[currentStudent] != null);
    }

    @Override
    public Student next() {
        return students[currentStudent++];
    }

}
