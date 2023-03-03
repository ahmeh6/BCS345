/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module4lab;

/**
 *
 * @author huzaifa
 */
public class VariableLengthArgs {
    public static int sum(int... nums){
        int sum = 0;
        for(int var : nums){
            sum +=var;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(1,3,4,5));
        System.out.println(sum(4,5,6,7));
        System.out.println(sum(2,5,7,8));
        System.out.println(sum(3,3,9,11));
        System.out.println(sum(9,5,3,2));
    }
}
