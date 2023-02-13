/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module2lab;

/**
 *
 * @author huzaifa
 */
public class Tabular {
    public static void main(String[] args) {
        System.out.printf("%-8s %-10s %-11s %-12s\n", "N", "10*N", "100*N", "1000*N");
        for(int i = 1; i <= 5; i++){
            System.out.printf("%-8d %-10d %-11d %-12d\n", i, i*10, i*100, i*1000);
        }
    }
}
