/*
4-. Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 más una comisión de 
$50,00 por computadora vendida. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta.
 */
package com.gm.mundopc.practicasemana2;

import java.util.Scanner;


public class SalarioVendedorPC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca el nombre del Vendedor :");
        String nombre = leer.nextLine();
        System.out.println("Numero de computadoras vendidas : ");
        double nurComputadorasVen = leer.nextDouble();
        System.out.println("-------------------------------------");
        System.out.println("Nombre :" + nombre);
        
        double salarioDev = SalarioVendedorPC.salarioVendedor(nurComputadorasVen);
        System.out.println("Salario De vendedor más comicion sin Renta : $"+ salarioDev);
        
        double salarioRenta = SalarioVendedorPC.renta(nurComputadorasVen);
        System.out.println("Salario de vendedor con comicion más renta : $"+ salarioRenta);
    }
    
    public static double salarioVendedor(double numerodeVentas){
        double salarioSinRenta = 300 + (numerodeVentas * 50);
        return salarioSinRenta;
    }
    
    public static double renta(double renta){
        double salarioSinRenta = 300 +(renta * 50);
        double salarioConRenta =  salarioSinRenta - (salarioSinRenta * 0.10) ;
        return salarioConRenta;
    }
}
