/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = lea.next();

        System.out.println("Ingrese el precio por hora: ");
        double tarifa = lea.nextDouble();
        
        
        System.out.println("Ingrese Horas laboradas en el mes: ");
        double horasmes = lea.nextDouble();
        
        double salario = horasmes*0.00595238;
        double total =  salario*tarifa;
        double tmensual = horasmes*0.00136986;
      
        System.out.println("--BOLETA DEL EMPLEADO--" + 
                "\nNombre del empleado: " + nombre +
                "\nHora de trabajo mensual: "+ tmensual + 
                "\nTarifa por hora: "+ tarifa + "Lps" + 
                "\nSalario del empleado semanal: lps" + total );
        
        

        
        

    }
    
}
