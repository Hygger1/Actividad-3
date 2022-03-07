/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.template;

/**
 *
 * @author angul
 */
public class MainTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            ClaseConcreta cc1 = new ClaseConcreta();
            ClaseConcreta2 cc2 = new ClaseConcreta2();

            int num1 = cc1.obtener(3);
            System.out.println("num1: " + num1);

            int num2 = cc2.obtener(50);
            System.out.println("num2: " + num2);
        }
    }

}
