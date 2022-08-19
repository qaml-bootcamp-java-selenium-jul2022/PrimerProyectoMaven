package EjerciciosControlDeFlujo;

public class Ejercicios {

    public void imprimirMensajeDiaSemana(DiaDeLaSemana dia) {
        switch (dia){
            case LUNES: break;
            case MARTES: break;
            case MIERCOLES: break;
            case JUEVES:
                System.out.println("Empieza el trabajo");
                break;
            case VIERNES:
                System.out.println("Casi fin de semana");
                break;
            case DOMINGO:
                System.out.println("Fin de semana!!!");
                break;
            default:
                System.out.println("Sabado");
                break;
        }
    }

}
