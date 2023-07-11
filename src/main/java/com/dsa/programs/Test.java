package com.dsa.programs;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test  {

     public static void main(String[] args) {

         HashMap<Employee,String> hm = new HashMap <>();

         Employee e1 = new Employee(1,"Aakash");
         e1.setName("lmno");
         Employee e4 = new Employee(1,"Jay");
         e4.setName("lmno");


         Employee e2 = new Employee(3,"Kunar");

         hm.put(e1,e1.getName());
         hm.put(e2,e2.getName());
         hm.put(e4,e4.getName());






         for (Map.Entry < Employee, String > hs:hm.entrySet()){

             System.out.println("employee is "+hs.getKey()+" value is "+hs.getValue());

         }

         e1.setName("const");
         e4.setName("const");

         System.out.println(hm.get(e1));
         System.out.println(hm.get(e4));

         System.out.println("After -------------->>>>>>>>>>>>>.");

         for (Map.Entry < Employee, String > hs:hm.entrySet()){

             System.out.println("employee is "+hs.getKey()+" value is "+hs.getValue());

         }

     }


}

class Employee{

    private int id ;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id ;
    }

    @Override
    public int hashCode() {

        int i = 31;
        int ans = 1;
        ans = ans*i+id;

        return ans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}




