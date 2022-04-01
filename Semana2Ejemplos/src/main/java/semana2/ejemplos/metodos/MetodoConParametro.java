
package semana2.ejemplos.metodos;


public class MetodoConParametro {
    public static void main(String[] args) {
        System.out.println("Metodo void");
        metodoConParametroVoid(1, 24.34, "Lucas");
        System.out.println("---------------------");
        System.out.println("Metodo Int");
        metodoConParametroInt(1);
        System.out.println("---------------------");
        System.out.println("Metodo Double");
        metodoConParametroDouble(24.34);
        System.out.println("---------------------");
        System.out.println("Metodo String");
        metodoConParametroString("Lucas");
    }
    
    public static void metodoConParametroVoid(int valorInt, double valorDouble, String valorString){
        System.out.println("Valor Int : " + valorInt);
        System.out.println("Valor double : " + valorDouble);
        System.out.println("Valor String : " + valorString);
    }
    
    public static int metodoConParametroInt(int valorInt){
        System.out.println("El valor int es : " + valorInt);
        return valorInt;
    }
    
    public static double metodoConParametroDouble(double valorDouble){
        System.out.println("El valor double es : " + valorDouble);
        return valorDouble;
    }
    
    public static String metodoConParametroString(String valorString){
        System.out.println("El valor de String es : " + valorString);
        return valorString;
    }
}
