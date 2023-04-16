package ejercicios;

import com.github.javafaker.Faker;
import model.Enemigo;
import utility.Logs;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {

    private final Faker faker;

    public Ejercicio5(Faker faker) {
        this.faker = faker;
    }

    public void ejercicio5Resuelto(int numeroEnemigos) {
        final var randomNumber = faker.number().numberBetween(20, 50);
        Logs.debug("%d", randomNumber);

        final var listEnemigos = new ArrayList<Enemigo>();
        for (var i = 0; i < numeroEnemigos; i++) {
            listEnemigos.add(new Enemigo(i + 1));
        }

        Logs.info(Arrays.toString(new ArrayList[]{listEnemigos}));

        bubbleSortAlphabetByEnemyName(listEnemigos);

        Logs.info("Ordenados Alfabeticamente");

        Logs.info(Arrays.toString(new ArrayList[]{listEnemigos}));
    }

    static void bubbleSortAlphabetByEnemyName(ArrayList<Enemigo> listEnemigos) {
        for (int j = 0; j < listEnemigos.size() - 2; j++) {
            for (int i = 1; i < listEnemigos.size() - 1; i++) {
                if (listEnemigos.get(i).getNombre().compareTo(listEnemigos.get(j).getNombre()) > 0) {
                    var cambio = listEnemigos.get(j);
                    listEnemigos.set(j, listEnemigos.get(i));
                    listEnemigos.set(i, cambio);
                }
            }
        }
    }
}
