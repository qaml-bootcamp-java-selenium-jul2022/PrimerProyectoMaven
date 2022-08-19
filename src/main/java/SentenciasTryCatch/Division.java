package SentenciasTryCatch;

public class Division {
    public void divisionEntreDosNumeros (int a, int b) {
        int resultado;

        try {
            resultado = a / b;
            System.out.println("El resultado es: " + resultado);
        }

        catch (Exception arithmeticException) {
            System.out.println("Error en la division");
        }

        finally {
            System.out.println("Sentencia finally");
        }
    }

    public void divisionEntreDosNumerosConExcepcion (int a, int b) throws Exception {
        int resultado;

        if (b == 0) {
            throw new Exception("Excepcion madre");
        } else {
            resultado = a/b;
            System.out.println("El resultado es: " + resultado);
        }
    }

    public void divisionEntreDosNumerosConExcepcionAritmetica (int a, int b) {
        int resultado;

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        } else {
            resultado = a/b;
            System.out.println("El resultado es: " + resultado);
        }
    }
}
