package com.dsa.programs.oops.java8.quetions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMaxMinMapToInt {

    public static void main(String[] args) {

        Employe e1 = new Employe(1,500,20);
        Employe e2 = new Employe(1,750,30);
        Employe e3 = new Employe(1,1500,35);
        Employe e4 = new Employe(1,2500,38);
        Employe e5 = new Employe(1,3500,45);

        List <Employe> emplist = Arrays.asList(e1,e2,e3,e4,e5);

        // sort in descending order
         emplist.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).collect(Collectors.toList()).forEach(System.out::println);

         // sort in ascending order
         emplist.stream().map(Employe::getSalary).sorted().forEach(System.out::println);

         // top 3 salary
        emplist.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).limit(3).collect(Collectors.toSet()).forEach(System.out::println);

        //salary less than 3rd highest salary
        emplist.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).skip(3).collect(Collectors.toSet()).forEach(System.out::println);


        // minimum
        System.out.println(emplist.stream().mapToInt(e-> e.getAge()).summaryStatistics().getMin());

        // maximum
        System.out.println(emplist.stream().mapToInt(e-> e.getAge()).summaryStatistics().getMax());

        //average
        System.out.println(emplist.stream().mapToInt(e-> e.getAge()).summaryStatistics().getAverage());

        // count
        System.out.println(emplist.stream().mapToInt(e-> e.getAge()).summaryStatistics().getCount());





    }
}

class Employe{

    private int id;
    private int salary;

    private int age;

    public Employe(int id, int salary,int age) {
        this.id = id;
        this.salary = salary;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
}
