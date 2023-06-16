package es.netmind.gestorcoches.persistencia;

import es.netmind.gestorcoches.factories.CocheFactory;
import es.netmind.gestorcoches.modelos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryRepoCoches {

    private final static InMemoryRepoCoches instancia = new InMemoryRepoCoches();
    private static List<ICoche> cochesList = new ArrayList<>();

    static {

        HashMap<String, Object> params = new HashMap<>();
        params.put("marca", "Porsche");
        params.put("tipo", "Deportivo");
        params.put("velocidad", 150);
        params.put("turbo", false);
        cochesList.add(CocheFactory.crear("deportivo", params));

        cochesList.add(new Familiar("Renault", "Familiar", 130, 4));
        cochesList.add(new SUV("Seat", "SUV", 100, 1));
        cochesList.add(new Limusina("Limo", "Limunsine", 90, 2));
    }

    private InMemoryRepoCoches() {
    }

    public static InMemoryRepoCoches getInstance() {
        return instancia;
    }

    public List<ICoche> getAll() {
        return cochesList;
    }


}
