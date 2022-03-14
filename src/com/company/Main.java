package com.company;

import java.util.Arrays;

import java.util.Iterator;


public class Main {


    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student(1, "Trixie", 33, "1", "Pro");

        students[1] = new Student(2, "David", 44, "2", "Dat");

        students[2] = new Student(3, "Montgomery", 31, "3", "Pro");

        students[3] = new Student(4, "Thomas", 40, "2", "Pro");

        students[4] = new Student(5, "Jane", 54, "1", "Dat");

        //BookStore store = new BookStore();

        StudentLibrary library = new StudentLibrary();

        Arrays.stream(students).forEach(student -> {

            //store.addBook(book);

            library.addStudent(student);

        });


        //System.out.println("Printing Book details of Book Store");

        //System.out.println(

        //        "-------------------------------------------------------------------------------------------------");

        //printBooks(store.iterator());

        System.out.println("Printing Student details of Student Library");

        System.out.println(

                "-------------------------------------------------------------------------------------------------");

        printStudents(library.iterator());

    }


    private static void printStudents(Iterator<Student> iterator) {

        // String language, String title, String author, long ISBN, double price

        System.out.printf("%10s | %35s | %15s | %15s | %10s\n", "ID", "Name", "Age", "Level", "Class Name");

        System.out.println(

                "-------------------------------------------------------------------------------------------------");

        while (iterator.hasNext()) {

            Student student = iterator.next();

            System.out.printf("%10s | %35s | %15s | %15s | %10s\n", student.getID(), student.getName(),

                    student.getAge(), student.getLevel(), student.getClassName());

        }

        System.out.println(

                "-------------------------------------------------------------------------------------------------");

        System.out.println();

    }


}
