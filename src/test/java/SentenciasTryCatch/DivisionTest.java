package SentenciasTryCatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division = new Division();
    @Test
    void divisionEntreDosNumeros() {
        int a = 8;
        int b = 4;

        division.divisionEntreDosNumeros(a, b);
    }

    @Test
    void divisionEntreDosNumerosNegativa() {
        int a = 4;
        int b = 0;

        division.divisionEntreDosNumeros(a, b);
    }

    @Test
    void divisionConExcepcion () throws Exception {
        int a = 6;
        int b = 0;

        division.divisionEntreDosNumerosConExcepcion(a, b);
    }

    @Test
    void divisionConExcepcionPositivo () throws Exception {
        int a = 6;
        int b = 6;

        division.divisionEntreDosNumerosConExcepcion(a, b);
    }

    @Test
    void divisionConExcepcionAritmetica () {
        int a = 6;
        int b = 0;

        division.divisionEntreDosNumerosConExcepcionAritmetica(a, b);
    }
}