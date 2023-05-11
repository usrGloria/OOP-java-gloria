package modelos.tazascafe;

public class Largo extends TazaCafe{
    private int porcentaje_agua;
    public Largo(int id, double volumen, String fabricante, boolean lista, int porcentaje_agua) {
        super(id, volumen, fabricante, lista);
        this.porcentaje_agua = porcentaje_agua;
    }
    @Override
    public boolean prepararTaza() {
        System.out.println("Preparando taza largo con porcentaje de agua: "
                + this.porcentaje_agua);
        return true;
    }

    public void metodoDiferente(){

    }

    @Override
    public String toString() {
        return "Largo{" +
                "tazacafe=" + super.toString() + "," +
                "porcentaje_agua=" + porcentaje_agua +
                '}';
    }
}

