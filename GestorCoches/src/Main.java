import models.Coche;
import models.Deportivo;

public class Main {
    public static void main(String[] args) {
        System.out.println("GESTOR COCHES");

        final int DISTANCIA = 100;

        Coche porsche = new Deportivo("Porsche", "Deportivo", 120, true);
        Coche renault = new Coche("Renault", "Familiar", 130);
        Coche seat = new Coche("Seat", "SUV", 100);

        porsche.puertas = 6;
        renault.puertas = 4;
        Coche.puertas = 3;

        System.out.println(porsche);
        System.out.println(renault);

        porsche.arrancar();
        renault.arrancar();
        seat.arrancar();

        double t1 = porsche.avanzar(DISTANCIA);
        double t2 = renault.avanzar(DISTANCIA);
        double t3 = seat.avanzar(DISTANCIA);

        porsche.parar();
        renault.parar();
        seat.parar();

        Coche masRapido = null;
        if (t1 < t2 && t1 < t3) masRapido = porsche;
        else if (t2 < t1 && t2 < t3) masRapido = renault;
        else if (t3 < t1 && t3 < t2) masRapido = seat;

        System.out.println("El más rápido es:");
        System.out.println(masRapido);
    }
}