package EjerciciosStrings;

public class EjerciciosStrings {

    //Traer métodos del otro proyecto
    public char caracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = '"';
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return  caracterEnIndice;
    }

    public int posicionDeDeterminadoCaracter (char caracter, String cadena){
        int posicion =-1;
        posicion=cadena.indexOf(caracter);
        return posicion;
    }

    public char reemplazarCaracterEnDeterminadoIndiceDeLaCadena (int indice, String cadena, char caracterReemplazoDeVacios) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';
        cadena = cadena.replace(' ', caracterReemplazoDeVacios);
        //System.out.println(cadena);
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return  caracterEnIndice;
    }

    public String insertarCharEnCadena (String cadena, char caracterAInsertar, int posicion) {
        System.out.println("El tamaño de la cadena ANTES de la insercion: " + cadena.length());
        StringBuilder constructorDeCadena = new StringBuilder(cadena);
        constructorDeCadena.insert(posicion, caracterAInsertar);
        System.out.println("El tamaño de la cadena DESPUÉS de la inserción: " + constructorDeCadena.length());
        return constructorDeCadena.toString();
    }

    public boolean metodoContieneCadena(String cadena1, String cadena2){
        //boolean resultado = false;

        //resultado = (cadena1.startsWith(cadena2)|| cadena1.endsWith(cadena2));


        return ((cadena1.startsWith(cadena2) || cadena1.endsWith(cadena2))?
                true
                :
                false);
    }



}
