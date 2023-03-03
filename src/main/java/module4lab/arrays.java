/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module4lab;

/**
 *
 * @author huzaifa
 */
public class arrays {
    public static void main(String[] args) {
        int[] counts;
        
        int[] bonus = {2,15,13,15,74,27,88,34,233,66,24,6,88,834,45};
        for(int i = 0; i<bonus.length; i++){
            bonus[i]++;
        }
        
        int[] bestScores = {99,98,98,86,100};
        for(int i = 0; i < bestScores.length; i++){
            System.out.println(bestScores[i]);
        }
    }
}
