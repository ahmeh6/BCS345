/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3inclass;

/**
 *
 * @author huzaifa
 */

public class ParkingGarage {
    public static double runningTotal;
    
    public static void main(String[] args) {
       
        
        double customer1 = calculateCharges(3);
        double customer2 = calculateCharges(5.3);
        double customer3 = calculateCharges(4.3);
        
        System.out.printf("Current Customer's total: $%.2f\n",customer3);
        System.out.printf("Running Total: $%.2f\n", runningTotal);
        
        System.out.printf("Is %d even: %b\n", 5, isEven(5));
        System.out.printf("Is %d even: %b\n", 4, isEven(4));
        System.out.printf("Is %d even: %b\n", 16, isEven(16));
        System.out.printf("Is %d even: %b\n", 323, isEven(323));
        
    }
    
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    
    public static double calculateCharges(double hours){
        double minCharge = 2;
        double perHourCharge = .5;
        double maxCharge = 10;
        
        double total = hours * perHourCharge;
        
        if(total <= maxCharge && total>=minCharge){
            runningTotal += total;
            return total;
        }else if(total < minCharge){
            runningTotal += total;
            return minCharge;
        }else{
            runningTotal += total;
            return maxCharge;
        }
    }
}


