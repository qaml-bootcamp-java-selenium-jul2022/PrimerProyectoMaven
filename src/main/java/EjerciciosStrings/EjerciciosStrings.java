package EjerciciosStrings;

public class EjerciciosStrings {

    //Traer metodos de otro proyecto
    public char caracterEnDeterminadoIndiceDeLaCadena(int indice, String cadena) {
        //Paso 1: Validar que el índice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = '"';
        if (indice < cadena.length()) {
            //Paso 2: Asignar a la variable que retornamos el valor de charAt(indice)
            caracterEnIndice = cadena.charAt(indice);
        }
        return caracterEnIndice;
    }

    public int posicionDeDeterminadoCaracter(char caracter, String cadena){
        int posicion = -1;
        posicion = cadena.indexOf(caracter);
        return posicion;
    }
    public char reemplazarCaracterEnDeterminadoIndiceDeLaCadena(int indice, String cadena, char caracterReemplazoDeVacios){
        //Paso1: validar que el indice se encuentre dentro del tamaño de la cadena
        char caracterEnIndice = ' ';

        System.out.println("Cadena antes del replace: " +cadena);
        cadena = cadena.replace(' ',caracterReemplazoDeVacios);

        if (indice<cadena.length()){
            //Paso 2: Asignar a la variable que retornamos el valor de charAt()
            caracterEnIndice = cadena.charAt(indice);
        }
        System.out.println("Esta es la cadena despues de la insercion: " + cadena);
        return caracterEnIndice;
    }

    public String insertarCharEnCadena(String cadena, char caracterAInsertar, int posicion){
        System.out.println("El tamaño de la cadena ANTES de la insercion: "+ cadena.length());
        StringBuilder constructorDeCadena = new StringBuilder(cadena);
        constructorDeCadena.insert(posicion,caracterAInsertar);
        System.out.println("El tamaño de la cadena DESPUES de la insercion: " + constructorDeCadena.length());
        return constructorDeCadena.toString();
    }
    public boolean metodoBooleano(String cadena1, String cadena2){

        return (cadena1.startsWith(cadena2) || cadena1.endsWith(cadena2))?
                true
                :
                false;
    }
}
