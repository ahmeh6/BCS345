/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module4lab;
import java.util.Scanner;

/**
 *
 * @author huzaifa
 */
public class Airline {
    private static boolean[] seatAssigned = new boolean[10];
    private static int seatNum;
    
    public static void assignSeat(int seatClass){
        if(seatClass == 1){
            for(int i = 0; i < 5; i++){
                if(seatAssigned[i] != true){
                    seatAssigned[i] = true;
                    seatNum = i+1;
                    break;
                }else {
                    System.out.println("First Class is full");
                }
            }
        }else if(seatClass == 2){
            for(int i = 5; i < 10; i++){
                if(seatAssigned[i] != true){
                    seatAssigned[i] = true;
                    seatNum = i+1;
                    break;
                }else {
                    System.out.println("Economy Class is full");
                }
            }
        }
    }
    
    public static void printBoardingPass(){
        if(seatNum < 6){
            System.out.printf("You have a First Class Seat. Seat Number is %d", seatNum);
        }else if(seatNum >= 6){
            System.out.printf("You have a Economy Class seat. Seat Number is %d", seatNum);
        }
             
    }
    
    public static void main(String[] args) {
        System.out.println("Please type 1 for First Class and Please type 2 for Economy.");
        Scanner input = new Scanner(System.in);
        int seatClass = input.nextInt();
        
        assignSeat(seatClass);
        
        printBoardingPass();
    }
}
