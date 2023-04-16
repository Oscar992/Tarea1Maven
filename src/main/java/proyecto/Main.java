package proyecto;

import com.github.javafaker.Faker;
import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import ejercicios.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        final var faker = new Faker();

        final var ejercicio1 = new Ejercicio1(faker);
        ejercicio1.ejercicio1Resuelto();

        final var ejercicio2 = new Ejercicio2(faker);
        ejercicio2.ejercicio2Resuelto();

        final var ejercicio3 = new Ejercicio3(faker);
        ejercicio3.ejercicio3Resuelto();

        final var ejercicio4 = new Ejercicio4(faker);
        final var numEnemigos = ejercicio4.ejercicio4Resuelto();

        final var ejercicio5 = new Ejercicio5(faker);
        ejercicio5.ejercicio5Resuelto(numEnemigos);
    }
}

