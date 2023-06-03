package com.dsa.programs.oops;

import java.util.Arrays;

public class Demo implements Cloneable{

    private int age;
    private String name ;
    private double salary;

     int[] arr ;

    public Demo(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    @Override
    public String toString() {
        return "Demo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public Demo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
