package EjerciciosStrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import EjerciciosStrings.*;

class EjerciciosStringsTest {
    String cadenaPrueba = "Esta es una prueba";
    EjerciciosStrings test = new EjerciciosStrings();
    int indice = 3;
    char caracterDeReemplazo = '*';
    @Test
    void caracterEnDeterminadoIndiceDeLaCadena() {
        char expectedResult = 'a';
        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    void caracterEnDeterminadoIndiceDeLaCadenaNegativo() {
        char expectedResult = 'x';
        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba);
        Assertions.assertNotEquals(expectedResult,actualResult);
    }

    @Test
    void indiceDeDeterminadoCaracter() {
        int expectedResult = 3;
        char determinadoCaracter = 'a';
        int actualResult = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    void indiceDeDeterminadoCaracterNegativo() {
        int expectedResult = 3;
        char determinadoCaracter = 'x';
        int actualResult = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);
        Assertions.assertNotEquals(expectedResult,actualResult);
    }
    @Test
    void reemplazarCaracterEnDeterminadoIndiceDeLaCadena() {
        char expectedResult = 'a';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba,caracterDeReemplazo);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    void reemplazarCaracterEnDeterminadoIndiceDeLaCadenaNegativo() {
        char expectedResult = '*';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba,caracterDeReemplazo);
        Assertions.assertNotEquals(expectedResult,actualResult);
    }

    @Test
    void insertarCharEnCadena(){
        String expectedResult = "Est*a es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, caracterDeReemplazo,indice);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void insertarCharEnCadenaNegativo(){
        String expectedResult = "Esta es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, caracterDeReemplazo,indice);
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}
