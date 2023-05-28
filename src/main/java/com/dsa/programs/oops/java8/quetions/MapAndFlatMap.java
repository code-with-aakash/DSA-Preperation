package com.dsa.programs.oops.java8.quetions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {

        List<String> cities1 = Arrays.asList("mumbai","pune","bangalore","pune");

        Employee e1 = new Employee(1,"aakash",cities1);

        List<String> cities2 = Arrays.asList("chennai","pune","noida");

        Employee e2 = new Employee(2,"with",cities2);

        List<String> cities3 = Arrays.asList("mumbai","pawai","noida");

        Employee e3 = new Employee(3,"code",cities3);

        List<Employee> list = Arrays.asList(e1,e2,e3);

        List<Integer> listInt= list.stream().map(Employee::getId).collect(Collectors.toList());

        System.out.println(listInt);

        List<List<String>> ls = list.stream().map(Employee::getCities).collect(Collectors.toList());
        System.out.println(ls);


        // here set supposed to remove duplicates in list, but it is not able to
        Set <List<String>> listSet = list.stream().map(e->e.getCities()).collect(Collectors.toSet());
        System.out.println(listSet);

        // to find unique values in 1D cities
        Set <Set<String>> listSetInternal = list.stream().map(e->e.getCities().stream().collect(Collectors.toSet())).collect(Collectors.toSet());
        System.out.println(listSetInternal);

        // flat map is useful in case of 2D list
        // here flat map reduces the values and collect only unique values from a stream
        Set <String> listOfSet = list.stream().flatMap(e-> e.getCities().stream()).collect(Collectors.toSet());
        System.out.println(listOfSet);


    }
}

class Employee{

    private int id ;
    private String name;
    private List <String> cities;

    public Employee(int id, String name, List < String > cities) {
        this.id = id;
        this.name = name;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }






    public List < String > getCities() {
        return cities;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }


}
