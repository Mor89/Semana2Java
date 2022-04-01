
package semana2.ejemplos.metodos;

public class EjemploMetodo {
    public static void main(String[] args) {
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }

    public static void metodoConVoid() {
        System.out.println("Contenido del metodo con Void");
    }

    private static void metodoConInt() {
        System.out.println("Contenido del metodo con Int");
    }

    private static void metodoConDouble() {
        System.out.println("Contenido del metodo con Double");
    }

    private static void metodoConString() {
        System.out.println("Contenido del metodo con String");
    }
}
