/*
3-. Una agencia de venta de autos paga a su personal de ventas un salario de $800,00 más una comisión de $170,00 por auto
vendido más un 5% del valor de venta. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de automóviles vendidos y el total del monto de ventas. Imprimir el nombre del vendedor y el salario 
devengado por este.
 */
package com.gm.mundopc.practicasemana2;

import java.util.Scanner;

public class SalarioVendedorAutos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdudca el nombre :");
        String nombre = leer.nextLine();
        System.out.println("Introdusca el Monto de venta :");
        double monto = leer.nextDouble();
        System.out.println("Introdusca numero de autos vendidos :");
        double autosVend = leer.nextDouble();
        System.out.println("-----------------------------------------");
        System.out.println("Nombre del Vendedor :" + nombre);
        
        double salarioDev = SalarioVendedorAutos.salarioVendedor(monto, autosVend);
        System.out.println("El salario devengado es : $"+ salarioDev);
    }
    
    public static double salarioVendedor(double montoVent, double numeroAutos ){
        double salario = 800;
        double comicion = 170;
        double salarioVendedor = salario + numeroAutos * comicion + montoVent * 0.05;
        return salarioVendedor;
    }
}
