/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module5lab3;

/**
 *
 * @author huzaifa
 */
public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
      super(firstName, lastName, socialSecurityNumber);
      
      if(hours <= 0 || hours > 168){
          throw new IllegalArgumentException("hours  must be > 0.0 and < 168.0");
      }
      
      if(wage <= 0) {
          throw new IllegalArgumentException("Wage must be a non-negative number");
      }
      
      this.hours = hours;
      this. wage = wage;
    }
    
    public void setHours(double hours){
        if(hours <= 0 || hours > 168){
          throw new IllegalArgumentException("hours  must be > 0.0 and < 168.0");
        }
        this.hours = hours;    
    }
    
    public double getHours() {return this.hours;}
    
    public void setWage(double wage){
        if(wage <= 0) {
          throw new IllegalArgumentException("Wage must be a non-negative number");
        }
        
        this.wage = wage;
    }
    
    public double earnings() {
        return hours * wage;
    }
    
    @Override
    public String toString(){
        return String.format("Hourly Employee: %s %s\nSocial Security Number: %s\nHours: %f\nWage: %f\nTotal Earnings: %f\n", 
                getFirstName(), getLastName(), getSocialSecurityNumber(), hours, wage, earnings());
    }
}
