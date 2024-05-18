
public class tabla_multiplicar {
    public static void main (String [ ] args) {
        int tabla = 1;
        int multiplicador = 1;
        int resultado = 0;

        while (tabla <= 10) {
            resultado = tabla * multiplicador;
            System.out.println(+tabla + "*" + multiplicador + "=" + +resultado);
            multiplicador = multiplicador + 1;

            if (multiplicador == 11) {
                System.out.println("Tabla de multiplicar del " + tabla);
                multiplicador = 1;
                tabla = tabla + 1;
            }
        }
    }
}