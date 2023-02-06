/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module2inclass;

/**
 *
 * @author huzaifa
 */
public class Employee {
    public Employee(){
        fname = "Null";
        lname = "Null";
        salary = 0;
    }
    public Employee(String fn, String lm, double sal){
        this.fname = fn;
        this.lname = lm;
        if(sal > 0){
            this.salary = sal;
        }
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }
    }
    
    private String fname;
    private String lname;
    private double salary;
}
