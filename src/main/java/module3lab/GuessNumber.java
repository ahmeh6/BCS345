/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module3lab;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author huzaifa
 */
public class GuessNumber {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int number = 1+ rand.nextInt(1000);
        System.out.println(number);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a guess: ");
        int userGuess = input.nextInt();
        
        while(userGuess != number) {
            if(userGuess > number){
                System.out.println("Too high. Try again.");
                userGuess = input.nextInt();
            }else if(userGuess < number){
                System.out.println("Too low. Try again.");
                userGuess = input.nextInt();
            }
        }
        
        if(userGuess == number){
            System.out.println("Congratulations. You guessed the number!");
            
        }
    }
}

