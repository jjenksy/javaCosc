package cs2.Lab1_hw1.playground;

import java.util.ArrayList;

/**
 * Created by jjenkins on 2/3/2017.
 */
public class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();

        ArrayList<Double> list = new ArrayList<>();
        int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        System.out.println(java.util.Collections.max(list));
    }
}

class Student extends Person {
    private String getInfo() {
        return "Student";
    }
}

class Person {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
}