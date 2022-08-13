package EjerciciosStrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import EjerciciosStrings.*;

class EjerciciosStringsTest {

    EjerciciosStrings test = new EjerciciosStrings();
    String cadenaPrueba = "Esta es una prueba";
    int indice =3;


    @Test
    void caracterEnDeterminadoIndiceDeLaCadena() {
        char expectedResult = 'a';
        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    void caracterEnDeterminadoIndiceDeLaCadenaNegativo() {
        char expectedResult = 'x';
        char actualResult = test.caracterEnDeterminadoIndiceDeLaCadena(indice,cadenaPrueba);
        Assertions.assertNotEquals(expectedResult, actualResult);

    }

    @Test
    void posicionDeDeterminadoCaracter() {
        int expectedResult = 3;
        char determinadoCaracter = 'a';
        int actualResult = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);
        Assertions.assertEquals(expectedResult,actualResult );

    }

    @Test
    void posicionDeDeterminadoCaracterNegativo() {
        int expectedResult = 2;
        char determinadoCaracter = 'a';
        int actualResult = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);
        Assertions.assertNotEquals(expectedResult,actualResult );
    }

    @Test
    void metodoContieneCadenaPositivo() {
        boolean expectedResult = true;
        String cadena1 = "Hola Mundo";
        String cadena2 = "Hola Mundo";
        boolean actualResult = test.metodoContieneCadena(cadena1,cadena2);
        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    void metodoContieneCadenaNegativo() {
        boolean expectedResult = true;
        String cadena1 = "Hola Mundo";
        String cadena2 = "Mundo Hola";
        boolean actualResult = test.metodoContieneCadena(cadena1,cadena2);
        Assertions.assertNotEquals(expectedResult,actualResult);
    }

    @Test
    void reemplazarCaracterEnDeterminadoIndiceDeLaCadena(){
        char expectedResult = 'a';
        char caracterReemplazoDeVacios='_';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba,caracterReemplazoDeVacios);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reemplazarCaracterEnDeterminadoIndiceDeLaCadenaNegativo(){
        char expectedResult = 'e';
        char caracterReemplazoDeVacios='_';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba,caracterReemplazoDeVacios);

        Assertions.assertNotEquals(expectedResult, actualResult);
    }
    @Test
    void insertarCharEnCadena (){
        char caracter = 'x';
        String expectedResult = "Estxa es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, caracter,indice );
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void insertarCharEnCadenaNegativo (){
        char caracter = 'j';
        String expectedResult = "Estxa es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, caracter,indice );
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}