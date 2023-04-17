package model;

import com.github.javafaker.Faker;

public class Enemigo {

    private final int id;
    private final String nombre;
    private final double peso;
    private final int ataque;
    private final Double puntosExp;
    private final boolean esTerrestre;

    public Enemigo(int id) {
        final var faker = new Faker();
        this.id = id;
        nombre = faker.name().name();
        peso = faker.number().numberBetween(50, 90);
        ataque = faker.number().numberBetween(1, 10);
        puntosExp = faker.number().randomDouble(0, 10000, 50000);
        esTerrestre = faker.bool().bool();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getAtaque() {
        return ataque;
    }

    public Double getPuntosExp() {
        return puntosExp;
    }

    public boolean isEsTerrestre() {
        return esTerrestre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ID: ");
        sb.append(id);
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("Peso: ");
        sb.append(peso);
        sb.append("Ataque: ");
        sb.append(ataque);
        sb.append("PuntosExp: ");
        sb.append(puntosExp);
        sb.append("esTerrestre: ");
        sb.append(esTerrestre + "} ");
        return sb.toString();
    }
}
