package EjerciciosControlDeFlujo;

import org.junit.jupiter.api.Test;
import EjerciciosControlDeFlujo.*;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {

    Ejercicios test = new Ejercicios();

    @Test
    void imporimrMensajeDiaSemana() {
        test.imporimrMensajeDiaSemana(DiaDeLaSemana.FRI);
    }

    @Test
    void imporimrMensajeDiaSemanaNegativo() {
        test.imporimrMensajeDiaSemana(DiaDeLaSemana.OTRO);
    }
}