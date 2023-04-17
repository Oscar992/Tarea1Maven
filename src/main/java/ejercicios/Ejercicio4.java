package ejercicios;

import com.github.javafaker.Faker;
import model.Enemigo;
import utility.Logs;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {

    private final Faker faker;

    public Ejercicio4(Faker faker) {
        this.faker = faker;
    }

    public int ejercicio4Resuelto() {
        final var randomNumber = faker.number().numberBetween(20, 50);
        Logs.debug("%d", randomNumber);

        final var listEnemigos = new ArrayList<Enemigo>();
        for (var i = 0; i < randomNumber; i++) {
            listEnemigos.add(new Enemigo(i + 1));
        }

        Logs.info(Arrays.toString(new ArrayList[]{listEnemigos}));

        bubbleSortEnemigos(listEnemigos);

        Logs.info("Ordenados alfabeticamente");
        Logs.info(Arrays.toString(new ArrayList[]{listEnemigos}));

        return listEnemigos.size();
    }

    static void bubbleSortEnemigos(ArrayList<Enemigo> arr) {
        var n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j).getAtaque() > arr.get(j + 1).getAtaque()) {
                    Enemigo temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
    }
}
