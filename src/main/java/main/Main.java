package main;

import classes.Enemigo;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        final var faker = new Faker();
        final var log = LogManager.getLogger("AUTOMATION");

        log.info("Ejercicio1 \n");
        ejercicio1(faker, log);

        log.info("Ejercicio2 \n");
        ejercicio2(faker, log);

        log.info("Ejercicio3 \n");
        ejercicio3(faker, log);

        log.info("Ejercicio4 \n");
        final var numEnemigos = ejercicio4(faker, log);

        log.info("Ejercici05 \n");
        ejercicio5(faker, log, numEnemigos);
    }

    static void ejercicio1(Faker faker, Logger log) {

        final var listEnemigos = new ArrayList<Enemigo>();
        final var mapEnemigos = new HashMap<Integer, Enemigo>();

        for (var i = 0; i < 150; i++) {
            var id = i + 1;
            var enemigo = new Enemigo(id);
            listEnemigos.add(enemigo);
            mapEnemigos.put(id, enemigo);
        }

        for (var i = 0; i < 150; i++) {
            log.debug(new Formatter().format("Enemigo %d ", listEnemigos.get(i).getId()).toString());
        }

        for (var i = 0; i < 5; i++) {
            var enemigo = mapEnemigos.get(faker.number().numberBetween(1, 150));
            log.info(new Formatter().format("Enemigo %d: Nombre %s, Peso %f, Ataque %d, PuntosExp %f, EsTerrestre %b\n",
                    enemigo.getId(),
                    enemigo.getNombre(),
                    enemigo.getPeso(),
                    enemigo.getAtaque(),
                    enemigo.getPuntosExp(),
                    enemigo.isEsTerrestre()));
        }
    }

    static void ejercicio2(Faker faker, Logger log) {
        var randomNumber = faker.number().numberBetween(20, 50);
        log.debug(randomNumber + "\n");

        var listNumbers = new ArrayList<Integer>();
        for (var i = 0; i < randomNumber; i++) {
            listNumbers.add(faker.number().numberBetween(100, 1000));
        }

        for (var i = 0; i < listNumbers.size(); i++) {
            log.info(listNumbers.get(i) + "\n");
        }

        bubbleSort(listNumbers);

        log.info("\n Ordenados \n");
        for (var i = 0; i < listNumbers.size(); i++) {
            log.info(listNumbers.get(i) + "\n");
        }
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

    static void ejercicio3(Faker faker, Logger log) {
        final var randomNumber = faker.number().numberBetween(20, 50);
        log.debug(randomNumber + "\n");

        final var listString = new ArrayList<String>();
        for (var i = 0; i < randomNumber; i++) {
            listString.add(faker.name().firstName());
        }

        for (var i = 0; i < listString.size(); i++) {
            log.info(listString.get(i) + "\n");
        }

        bubbleSortAlphabet(listString);
        log.info("\n Ordenados Alfabeticamente \n");

        for (var i = 0; i < listString.size(); i++) {
            log.info(listString.get(i) + "\n");
        }
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

    static int ejercicio4(Faker faker, Logger log) {
        final var randomNumber = faker.number().numberBetween(20, 50);
        log.debug(randomNumber + "\n");

        final var listEnemigos = new ArrayList<Enemigo>();
        for (var i = 0; i < randomNumber; i++) {
            listEnemigos.add(new Enemigo(i + 1));
        }

        for (var i = 0; i < listEnemigos.size(); i++) {
            log.info(listEnemigos.get(i).getNombre());
        }

        bubbleSortEnemigos(listEnemigos);

        for (var i = 0; i < listEnemigos.size(); i++) {
            log.info(listEnemigos.get(i).getNombre() + " Ataque: " + listEnemigos.get(i).getAtaque());
        }

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

    static void ejercicio5(Faker faker, Logger log, int numeroEnemigos) {
        final var randomNumber = faker.number().numberBetween(20, 50);
        log.debug(randomNumber + "\n");

        final var listEnemigos = new ArrayList<Enemigo>();
        for (var i = 0; i < numeroEnemigos; i++) {
            listEnemigos.add(new Enemigo(i + 1));
        }

        for (var i = 0; i < listEnemigos.size(); i++) {
            log.info(listEnemigos.get(i).getNombre());
        }

        bubbleSortAlphabetByEnemyName(listEnemigos);

        log.info("\n Ordenados Alfabeticamente \n");

        for (var i = 0; i < listEnemigos.size(); i++) {
            log.info(listEnemigos.get(i).getNombre());
        }
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

