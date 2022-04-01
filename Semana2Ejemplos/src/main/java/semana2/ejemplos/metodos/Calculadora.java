package semana2.ejemplos.metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

    public static void main(String[] args) throws IOException {
        double cantidad1 = 0, cantidad2 = 0;
        //Crear el objeto leer de las clases correspondientes para obtener los datos
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese cantidad 1: ");
        //Hace lalectura desde teclado y lo combierte a double
        cantidad1 = Double.parseDouble(leer.readLine());
        System.out.println("Ingrese cantidad 2 : ");
        cantidad2 = Double.parseDouble(leer.readLine());
        System.out.println("-------------------------------------");
        try { //se utiliza el manejador de errores de lo contrario genera error
            System.out.println("El resultado de la suma es : " + Calculadora.sumar(cantidad1, cantidad2));
            System.out.println("El resultado de la resta es : " + Calculadora.restar(cantidad1, cantidad2));
            System.out.println("El resultado de la multiplicasion es : " + Calculadora.multiplicar(cantidad1, cantidad2));
            System.out.println("El resultado de la divicion es : " + Calculadora.dividir(cantidad1, cantidad2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------------");
        System.out.println("Respuesta : \n");
        System.out.println(cantidad1 + "\n" + cantidad2);
    }

    public static double sumar(double cantidad1, double cantidad2) {
        double suma;
        suma = cantidad1 + cantidad2;
        return suma;
    }

    public static double restar(double cantidad1, double cantidad2) {
        double restar;
        restar = cantidad1 - cantidad2;
        return restar;
    }

    public static double multiplicar(double cantidad1, double cantidad2) {
        double multiplicar;
        multiplicar = cantidad1 * cantidad2;
        return multiplicar;
    }

    public static double dividir(double cantidad1, double cantidad2) {
        double dividir;
        dividir = cantidad1 / cantidad2;
        return dividir;
    }
}
