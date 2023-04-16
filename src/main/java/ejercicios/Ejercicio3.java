package ejercicios;

import com.github.javafaker.Faker;
import utility.Logs;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio3 {
    private final Faker faker;

    public Ejercicio3(Faker faker) {
        this.faker = faker;
    }

    public void ejercicio3Resuelto() {
        final var randomNumber = faker.number().numberBetween(20, 50);
        Logs.debug("%d", randomNumber);

        final var listString = new ArrayList<String>();
        for (var i = 0; i < randomNumber; i++) {
            listString.add(faker.name().firstName());
        }

        Logs.info(Arrays.toString(new ArrayList[]{listString}));

        bubbleSortAlphabet(listString);

        Logs.info("Ordenados Alfabeticamente");
        Logs.info(Arrays.toString(new ArrayList[]{listString}));
    }

    static void bubbleSortAlphabet(ArrayList<String> listNames) {
        for (int j = 0; j < listNames.size() - 2; j++) {
            for (int i = 1; i < listNames.size() - 1; i++) {
                if (listNames.get(i).compareTo(listNames.get(j)) > 0) {
                    var cambio = listNames.get(j);
                    listNames.set(j, listNames.get(i));
                    listNames.set(i, cambio);
                }
            }
        }
    }
}
