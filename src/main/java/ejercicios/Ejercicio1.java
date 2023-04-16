package ejercicios;

import com.github.javafaker.Faker;
import model.Enemigo;
import utility.Logs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ejercicio1 {

    private final Faker faker;

    public Ejercicio1(Faker faker) {
        this.faker = faker;
    }

    public void ejercicio1Resuelto() {

        final var listEnemigos = new ArrayList<Enemigo>();
        final var mapEnemigos = new HashMap<Integer, Enemigo>();

        for (var i = 0; i < 150; i++) {
            listEnemigos.add(new Enemigo(i + 1));
            mapEnemigos.put(i + 1, new Enemigo(i + 1));
        }

        Logs.info(Arrays.toString(new ArrayList[]{listEnemigos}));

        for (var i = 0; i < 5; i++) {
            final var enemigo = mapEnemigos.get(faker.number().numberBetween(1, 150));
            Logs.info("Enemigo %d: Nombre %s, Peso %f, Ataque %d, PuntosExp %f, EsTerrestre %b",
                    enemigo.getId(),
                    enemigo.getNombre(),
                    enemigo.getPeso(),
                    enemigo.getAtaque(),
                    enemigo.getPuntosExp(),
                    enemigo.isEsTerrestre());
        }
    }
}
