/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20;

import java.util.Scanner;

/**
 *
 * @author Luicha
 */
public class Java20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        String coso1, coso2, coso3, coso4;
        Scanner temp = new Scanner (System.in);
        coso1 = "";
        coso2 = "";
        coso3 = "";
        coso4 = "";
        
        System.out.println("Ingrese 4 números:");
        num1 = temp.nextInt();
        num2 = temp.nextInt();
        num3 = temp.nextInt();
        num4 = temp.nextInt();
        
        for (int i = 1; i <= num1; i++) {
            coso1 = coso1.concat("*");
        }
        System.out.println(num1 + "  " + coso1);
        
        for (int i = 1; i <= num2; i++) {
            coso2 = coso2.concat("*");
        }
        System.out.println(num2 + "  " + coso2);
         
        for (int i = 1; i <= num3; i++) {
            coso3 = coso3.concat("*");
        }
        System.out.println(num3 + "  " + coso3);
        
        for (int i = 1; i <= num4; i++) {
            coso4 = coso4.concat("*");
        }
        System.out.println(num4 + "  " + coso4);
        
        
    }
}
