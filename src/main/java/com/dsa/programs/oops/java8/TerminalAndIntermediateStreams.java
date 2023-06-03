package com.dsa.programs.oops.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalAndIntermediateStreams {

    public static void main(String[] args) {


        Employee e1 = new Employee(1,"code1");
        Employee e2 = new Employee(2,"code2");
        Employee e3 = new Employee(3,"code3");
        Employee e4 = new Employee(4,"code4");

        List <Employee> emplist = Arrays.asList(e1,e2,e3,e4);

        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        System.out.println(intList.stream().filter(a->a%2==0).map(a->a+a).filter(a->a>5).count());

        emplist.stream().filter(e->e.getId()%2==0).map(e->{         // here { bracket is for changing the type of object from e to anything else
            e.PrintName(); // this is just method call
            return e.getCode(); // here e is replaced with e.getCode
//            return e;
        }).forEach(e-> System.out.println("At last "+e));

        // if remove foreach method nothing wil be printed as terminal operator is required to print anything in stream .

        // peek is used for debugging purpose only
        System.out.println(intList.stream().filter(a->a%2==0).map(a->a+a).peek(System.out::println).filter(a->a>2).count());

         // reduce
//        System.out.println(intList.stream().reduce(Integer::sum).get());
        System.out.println(intList.stream().reduce((a,b)->a+b).get());


        // joining and returning as String
        System.out.println(emplist.stream().map(e->e.getCode().toUpperCase()).collect(Collectors.joining(",")));





    }
}

class Employee {

    private int id ;
    private String code;

    public Employee(int id, String code) {
        super();
        this.id = id;
        this.code = code;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", code=" + code +
                '}';
    }

    public void PrintName(){
        System.out.println("in emp class " +code);
    }
}

