/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        double total=0, cuotaMeses=0, total1=0, conversion=0;
        System.out.println("Ingrese el monto del pretamo: ");
        double prestamo = lea.nextDouble();
        System.out.println("Ingrese el plazo de pago en meses: ");
        double plazo = lea.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        double interes = lea.nextDouble();
        conversion = interes/100;
        total = prestamo*plazo*conversion;
        cuotaMeses = total/plazo;
        total1 = prestamo + total;
        
        
        System.out.println("***CUOTAS MENSUALES***" + 
                "\nCuota de pago mensual: HNL " + cuotaMeses + 
                "\nTotal a pagar: "  + total1);
        
        
        
        
    }
    
}
