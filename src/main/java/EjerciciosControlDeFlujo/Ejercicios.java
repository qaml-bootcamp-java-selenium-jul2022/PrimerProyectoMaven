package EjerciciosControlDeFlujo;

public class Ejercicios {
    public void imporimrMensajeDiaSemana(DiaDeLaSemana dia){
        switch (dia){
            case MON:
            case TUE:
            case WED:
            case THU:
                System.out.println("Time to work"); break;
            case FRI:
                System.out.println("Nearing weekend"); break;
            case SAT:
            case SUN:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }
    }
}
