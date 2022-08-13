package EjerciciosStrings;

import org.junit.jupiter.api.*;

class EjerciciosStringsTest {
    String cadenaPrueba = "Esta es una prueba";
    EjerciciosStrings test = new EjerciciosStrings();
    int indice = 3;

    @Test
    void caracterEnDeterminadoIndiceDeLaCadena() {
        char expectedResult = 'a';

        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba);

        //Asertar que son iguales
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void caracterEnDeterminadoIndiceDeLaCadenaNegativo() {
        char expectedResult = 'x';

        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba);

        //Asertar que NO son iguales
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Test
    void posicionDeDeterminadoCaracter() {
        int expectedResult = 3;
        char determinadoCaracter = 'a';

        int actualResult  = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}