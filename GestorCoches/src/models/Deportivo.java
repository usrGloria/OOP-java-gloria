package models;

public class Deportivo extends Coche {
    private boolean turbo;

    public Deportivo(String marca, String tipoCoche, int velocidad, boolean turbo) {
        super(marca, tipoCoche, velocidad);
        this.turbo = turbo;
    }

    public double mover(int distancia) {
        if (this.arrancado) {
            /*if (this.turbo) inc = 2;
            else inc = 1;*/
            int inc = this.turbo ? 2 : 1;

            double tiempo = (double) distancia / ((double) this.velocidad * inc);
            this.posicion += distancia;
            return tiempo;
        } else {
            return 0;
        }
    }

}
