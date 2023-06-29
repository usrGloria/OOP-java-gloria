package es.netmind.simuladorcoches;

import es.netmind.simuladorcoches.modelos.coches.Deportivo;
import es.netmind.simuladorcoches.modelos.coches.Familiar;
import es.netmind.simuladorcoches.modelos.coches.ICoche;
import es.netmind.simuladorcoches.modelos.coches.SUV;
import es.netmind.simuladorcoches.modelos.motores.Combustion;
import es.netmind.simuladorcoches.modelos.motores.Electrico;
import es.netmind.simuladorcoches.servicios.ServicioCoches;

public class GestorArrayCoches {

    static int DISTANCIA = 100;

    public static void main(String[] args) {
        System.out.println("SIMULADOR DE COCHES");

        try {
            DISTANCIA = new Integer(args[0]);
            System.out.println("Distania correcta: " + DISTANCIA);
        } catch (NumberFormatException ex) {
            System.out.println("Distancia incorecta, continuamos con el:" + DISTANCIA);
        } catch (Exception ex) {
            System.out.println("Ha habido un error");
            return;
        }

        System.out.println("Cargando ....");

        ICoche[] listaCoches = {
                new Deportivo("Porsche", "Deportivo", 120, false),
                new Familiar("Renault", "Familiar", 130, 5),
                new SUV("Seat", "SUV", 100, 1)
        };

        listaCoches[0].setMotor(new Combustion(1,90));
        listaCoches[1].setMotor(new Electrico(2, 120));
        listaCoches[2].setMotor(new Combustion(3, 130));


        ICoche masRapido = null;
        try {
            masRapido = ServicioCoches.encontrarMasRapido(listaCoches, DISTANCIA);
            System.out.println("El coche más rápido es:");
            System.out.println(masRapido);
        } catch (NullPointerException e) {
            System.out.println("La lista de coches está vacia :-( "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Ooops ... ha habido un error :-("+e.getMessage());
        }


    }


}
