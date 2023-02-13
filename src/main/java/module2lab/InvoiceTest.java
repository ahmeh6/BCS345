/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module2lab;

import module2lab.Invoice;

/**
 *
 * @author huzaifa
 */
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice order1;
        order1 = new Invoice("A233D", "Nail", 32, 2.99);
        System.out.println("Invoice Amount: " +order1.getInvoiceAmount());
    }
}
