/*
2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010 
utilizando la siguiente fórmula:
DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10
El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento 
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores:
Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100. 
Imprimir los valores capturados así como el monto del DAI. 
 */
package com.gm.mundopc.practicasemana2;

import java.util.Scanner;

public class ValordeDai {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Valor de veiculo :");
        double veiculoPrecio = leer.nextDouble();
        System.out.println("Valor de Flete : ");
        double flete = leer.nextDouble();
        System.out.println("Valor de seguro : ");
        double seguro = leer.nextDouble();  
        
        double valorDAI = ValordeDai.valorDAI(veiculoPrecio, flete, seguro);
        System.out.println("El monto de DAI es : $" +valorDAI);
    }
    
    public static double valorDAI(double veiculoPrecio, double flete, double seguro){
        double depreciacion = veiculoPrecio * 0.10;
        double DAI = (veiculoPrecio - depreciacion - flete - seguro ) * 0.25;
        return DAI;
    }
}
