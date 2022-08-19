package EjerciciosControlDeFlujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {

    @Test
    void imprimirMensajeDiaSemana() {
        Ejercicios testDiaSemana = new Ejercicios();
        testDiaSemana.imprimirMensajeDiaSemana(DiaDeLaSemana.SABADO);
    }
}