/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module2inclass;

import module2inclass.Employee;

/**
 *
 * @author huzaifa
 */
public class EmployeeTest {
    public static void main(String[] args) {
         Employee emp1, emp2;
         
         emp1 = new Employee("John", "Doe", 23000);
         emp2 = new Employee("Mike", "Smith", 35000);
         
         System.out.println(emp1.getFname() + "'s Salary is: " +emp1.getSalary());
         System.out.println(emp2.getFname() + "'s Salary is: " +emp2.getSalary());
         
         emp1.setSalary(emp1.getSalary() * 1.1);
         emp2.setSalary(emp2.getSalary() * 1.1);
         
         
         System.out.println(emp1.getFname() + "'s new Salary is: " +emp1.getSalary());
         System.out.println(emp2.getFname() + "'s new Salary is: " +emp2.getSalary());
    }
}
