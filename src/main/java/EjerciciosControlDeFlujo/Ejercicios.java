package EjerciciosControlDeFlujo;

public class Ejercicios {
    public void imprimirMensajeDiaSemana(DiaDeLaSemana dia) {
        switch (dia){
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
                System.out.println("Empieza el trabajo");
            case VIERNES:
                System.out.println("Casi fin de semana");
            case DOMINGO:
                System.out.println("Fin de semana!!!");
            default:
                System.out.println("Sabado");
        }
    }
}
