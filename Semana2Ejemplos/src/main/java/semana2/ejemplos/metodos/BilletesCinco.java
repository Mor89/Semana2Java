package semana2.ejemplos.metodos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BilletesCinco {

    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cantidadDinero;
        try {
            System.out.println("Cantidad : ");
            cantidadDinero = leer.readLine();//lectura tipo string
            String cantidadCinco = BilletesCinco.obterBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de Billetes de $5.00 : " + cantidadCinco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String obterBilletesDeCinco(String cantidadDinero) {
        double montoDinero = Double.parseDouble(cantidadDinero);// convertir a double
        int billetesCinco = (int) (montoDinero / 5);
        String resultado = String.valueOf(billetesCinco);
        return resultado;
    }
}
