package EjerciciosControlDeFlujo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EjerciciosTest {

    @Test
    void imprimirMensajeDiaSemana() {
        Ejercicios testDiaSemana = new Ejercicios();

        testDiaSemana.imprimirMensajeDiaSemana(DiaDeLaSemana.SABADO);

        testDiaSemana.imprimirMensajeDiaSemana(DiaDeLaSemana.JUEVES);

        testDiaSemana.imprimirMensajeDiaSemana(DiaDeLaSemana.VIERNES);

        testDiaSemana.imprimirMensajeDiaSemana(DiaDeLaSemana.LUNES);
    }
}