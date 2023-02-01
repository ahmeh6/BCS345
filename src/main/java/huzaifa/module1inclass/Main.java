/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huzaifa.module1inclass;

import java.util.Scanner;

/**
 *
 * @author huzaifa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter you number");
        int userNum = input.nextInt();
        int num1 = userNum%10;
        int num2 = (userNum%100) /10;
        int num3 = (userNum%1000) / 100;
        int num4 = (userNum%10000) / 1000;
        int num5 = (userNum%100000) / 10000;
        System.out.printf("%d %d %d %d %d", num5, num4, num3, num2, num1);
    }
}
