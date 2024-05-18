
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class TablasMultiplicar {
    public static void main(String[] args) {
        int numeroDeTabla = 5; // Cambia este número según lo que necesites
        imprimirTabla(numeroDeTabla);
    }

    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            int resultado = numeroDeTabla * x;
            System.out.printf("%d x %d = %d%n", numeroDeTabla, x, resultado);
        }
    }
}