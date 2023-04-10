package classes;

public class Enemigo {


    private final int id;
    private final String nombre;
    private final double peso;
    private final int ataque;
    private final Double puntosExp;
    private final boolean esTerrestre;
    
    public Enemigo(int id, String nombre, double peso, int ataque, Double puntosExp, boolean esTerrestre) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.ataque = ataque;

        this.puntosExp = puntosExp;
        this.esTerrestre = esTerrestre;
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
}
