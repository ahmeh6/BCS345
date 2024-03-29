/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5lab;

/**
 *
 * @author huzaifa
 */
public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee =             
         new BasePlusCommissionEmployee(                
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:%n");
      System.out.printf("%s %s%n", "First name is",
         employee.employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee.toString());
   } 
} 

