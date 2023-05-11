package modelos.tazascafe;

public class Corto extends TazaCafe {
    private int cantidadLeche;

    public Corto(int id, double volumen, String fabricante, boolean lista, int cantidadLeche) {
        super(id, volumen, fabricante, lista);
        this.cantidadLeche = cantidadLeche;
    }

    private void auxPrepararTaza(){
        // logica auxiliar
    }
    @Override
    public boolean prepararTaza() {
        auxPrepararTaza();
        System.out.println("Preparando taza corto con cantidad de leche: " + this.cantidadLeche);
        return true;
    }

    @Override
    public String toString() {
        return "Corto{" +
                "tazacafe=" + super.toString() + "," +
                "cantidadLeche=" + cantidadLeche +
                '}';
    }

}
