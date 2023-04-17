package ejercicios;

import com.github.javafaker.Faker;
import utility.Logs;

import java.util.ArrayList;

public class Ejercicio2 {

    private final Faker faker;

    public Ejercicio2(Faker faker) {
        this.faker = faker;
    }

    public void ejercicio2Resuelto() {

        final var randomNumber = faker.number().numberBetween(20, 50);
        Logs.debug("%d", randomNumber);

        final var listNumbers = new ArrayList<Integer>();
        for (var i = 0; i < randomNumber; i++) {
            listNumbers.add(faker.number().numberBetween(100, 1000));
        }

        Logs.info(listNumbers.toString());
        
        bubbleSort(listNumbers);

        Logs.info("Ordenados");
        Logs.info(listNumbers.toString());
    }

    static void bubbleSort(ArrayList<Integer> arr) {
        var n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
    }
}
