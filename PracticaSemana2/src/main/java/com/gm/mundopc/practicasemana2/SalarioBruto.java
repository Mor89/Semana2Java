/*
5-. Escriba un programa para calcular el salario bruto de un empleado. Para calcular el salario del empleado debemos de hacer 
los descuentos por llegadas tardías así como la retención de la renta que es el 10% del salario menos el descuento por llegada 
tardía. Debe de crear una fórmula para determinar el salario por minuto y calcular el monto por las llegadas tardías y 
descontarlo al salario, luego debe de descontar el monto de la renta. El programa deberá permitir ingresar el nombre del
empleado, el salario mensual. El programa deberá de imprimir el nombre del empleado, el descuento por llegadas tardías, la 
retención de la renta y finalmente el salario bruto.
 */
package com.gm.mundopc.practicasemana2;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de Empleado :");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el salario mensual :");
        double salario = leer.nextDouble();
        System.out.println("Ingrese el descuento por llegadas tardias en Horas :");
        double descuento = leer.nextDouble();
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("Nombre de Empleado : " + nombre);
        double desPorLLegaTardia = SalarioBruto.descPorLLegadasTard(salario, descuento);
        System.out.println("Descuento por llegadas tardia en horas : $" + desPorLLegaTardia);
        double renta = SalarioBruto.renta(salario);
        System.out.println("Descuento con renta : $" +renta);
        double salarioBruto = SalarioBruto.salarioBruto(salario, descuento);
        System.out.println("El salario bruto es : $" + salarioBruto);
    }
    
    public static double descPorLLegadasTard(double salarioMens, double descuento){
        double descuentoPorHor = (((salarioMens /4)/7)/8) * descuento; 
        return descuentoPorHor;         
    }
    public static double renta (double salarioMens){
        double descuentoRent = salarioMens - (salarioMens * 0.10);
        return descuentoRent;
    }
    
    public static double salarioBruto(double salarioMens, double descuento){
        double descuentoPorHor = (((salarioMens / 4)/7)/8)* descuento;
        double descuentoRent = salarioMens * 0.10;
        double salarioBruto = salarioMens - descuentoPorHor - descuentoRent;
        return salarioBruto;
    }
}
