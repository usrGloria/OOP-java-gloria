import modelos.tazascafe.Corto;
import modelos.tazascafe.Largo;
import modelos.tazascafe.TazaCafe;

public class UITazasCafe {

    public static void main(String[] args) {
        System.out.println("GESTOR DE TAZAS DE CAFÉ");

        TazaCafe taza1 = new TazaCafe(1, 2.3, "X", false);
        System.out.println("taza1:" + taza1);
        taza1.prepararTaza();
        taza1.servirTaza();
        System.out.println("taza1:" + taza1);

        TazaCafe taza2 = new Corto(2, 3.0, "Y", false, 10);
        taza2.prepararTaza();
        taza2.servirTaza();
        System.out.println("taza2:" + taza2);

        TazaCafe taza3 = new Largo(3, 3.0, "Y", false, 10);
        taza3.prepararTaza();
        taza3.servirTaza();
        System.out.println("taza3:" + taza3);

        System.out.println("PROCESO HOMOGENEO");

        TazaCafe[] listaTazas = {taza1, taza2, taza3};

        for (TazaCafe taza : listaTazas) {
            taza.prepararTaza();
            taza.servirTaza();
        }

    }

}
