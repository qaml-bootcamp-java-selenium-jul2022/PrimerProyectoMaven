package EjerciciosStrings;

import org.junit.jupiter.api.*;

class EjerciciosStringsTest {
    String cadenaPrueba = "Esta es una prueba";
    EjerciciosStrings test = new EjerciciosStrings();
    int indice = 3;

    char cadenaDeRemplazo = '*';

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
    @Test
    void posicionDeDeterminadoCaracterNegativo(){
        int expectedResult = 1;
        char determinadoCaracter = 'a';
        int actualResult = test.posicionDeDeterminadoCaracter(determinadoCaracter, cadenaPrueba);

        Assertions.assertNotEquals(expectedResult,actualResult);
    }
    @Test
    void  reemplazarCaracterEnDeterminadoIndiceDeLaCadena(){
        char expectedResult = 'a';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba, cadenaDeRemplazo);


        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    void  reemplazarCaracterEnDeterminadoIndiceDeLaCadenaNegativo(){
        char expectedResult = 'x';
        char actualResult = test.reemplazarCaracterEnDeterminadoIndiceDeLaCadena(indice, cadenaPrueba, cadenaDeRemplazo);

        Assertions.assertNotEquals(expectedResult,actualResult);

    }
    @Test
    void insertarCharEnCadena(){
        String expetecResult = "Est*a es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, cadenaDeRemplazo, indice);

        Assertions.assertEquals(expetecResult, actualResult);
    }

    @Test
    void insertarCharEnCadenaNegativo(){
        String expetecResult = "Estaa es una prueba";
        String actualResult = test.insertarCharEnCadena(cadenaPrueba, cadenaDeRemplazo, indice);

        Assertions.assertNotEquals(expetecResult, actualResult);
    }
}