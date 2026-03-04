package model;

public class Cours {

    private Long id;
    private String nom;
    private int coefficient;

    public Cours(Long id, String nom, int coefficient) {
        this.id = id;
        this.nom = nom;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Cours other = (Cours) obj;

        return this.id.equals(other.id);
    }

}
