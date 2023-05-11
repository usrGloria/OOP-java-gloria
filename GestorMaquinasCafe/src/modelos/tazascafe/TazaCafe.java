package modelos.tazascafe;

public class TazaCafe {
    protected int id;
    protected double volumen;
    protected String fabricante;
    protected boolean lista;

    public TazaCafe(int id, double volumen, String fabricante, boolean lista) {
        this.id = id;
        this.volumen = volumen;
        this.fabricante = fabricante;
        this.lista = lista;
    }

    public boolean prepararTaza() {
        System.out.println("Preparando taza café-...");
        return true;
    }

    public boolean servirTaza() {
        System.out.println("Taza lista-...");
        this.lista = true;
        return this.lista;
    }

    @Override
    public String toString() {
        return "TazaCafe{" +
                "id=" + id +
                ", volumen=" + volumen +
                ", fabricante='" + fabricante + '\'' +
                ", lista=" + lista +
                '}';
    }
}
