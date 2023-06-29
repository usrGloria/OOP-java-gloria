package es.netmind.simuladorcoches.servicios;

import es.netmind.simuladorcoches.excepciones.CocheException;
import es.netmind.simuladorcoches.modelos.coches.ICoche;

public class ServicioCoches {

    public static ICoche encontrarMasRapido(ICoche[] listaC, int distancia) throws NullPointerException, CocheException, Exception {
        ICoche masRapido = null;
        double tiempoMenor = Double.POSITIVE_INFINITY;
        try {
            for (ICoche unC : listaC) {
                unC.validar();
                unC.arrancar();
                double tActual = unC.avanzar(distancia);
                unC.parar();

                if (tActual < tiempoMenor) {
                    tiempoMenor = tActual;
                    masRapido = unC;
                }
            }

            return masRapido;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Enviando mensaje admin sobre error: " + e.getMessage());
            throw e;
        }
    }
}
