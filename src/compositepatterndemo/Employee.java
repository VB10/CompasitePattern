/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    
    private String name;
    private String dept;
    private int Salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int Salary) {
        this.name = name;
        this.dept = dept;
        this.Salary = Salary;
       subordinates= new  ArrayList<Employee>();
    }
    
    public void add(Employee e){
        subordinates.add(e);
    }
    public void remove(Employee e) {
        subordinates.remove(e);
    }
    
    public List<Employee> getSubordinates() {
    
    return subordinates;
}
    
    public String toString() {
        return ("Employee :[ Name : "+ name 
                +", dept : "+ dept + 
                ", salary :" + Salary+" ]");

               
    }
    
    
}
