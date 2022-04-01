/*
1-. Escriba un programa que imprima por pantalla cuánto le costará comprar una computadora a un determinado precio 
si sabe que puede conseguir una rebaja del 15%. No olvidar que al precio del artículo se le debe de agregar el IVA. El 
programa deberá permitir digitar el precio de la computadora y deberá de realizar los cálculos correspondientes.
 */
package com.gm.mundopc.practicasemana2;

import java.util.Scanner;


public class PrecioDeComputadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introdusca el Precio Base de la Computadora : ");
        double precio = leer.nextDouble();
        
        double descuento = PrecioDeComputadora.precioDelaPC(precio);
        System.out.println("El precio de la computadora con IVA y Descuento es : $" + descuento);
    }
    
    public static double precioDelaPC(double precio){
        double conIva = (precio * 0.13)+precio;
        double descuento = conIva -(conIva * 0.15);
        return descuento;
    }
}
