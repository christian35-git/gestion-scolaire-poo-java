package model;

import java.time.LocalDate;

public class Note {

    private Long id;
    private double valeur;
    private LocalDate date;
    private Cours cours;

    public Note(Long id, double valeur, Cours cours) {
        this.id = id;
        this.valeur = valeur;
        this.cours = cours;
        this.date = LocalDate.now();
    }

    public double getValeur() {
        return valeur;
    }

    public Cours getCours() {
        return cours;
    }

    public LocalDate getDate() {
        return date;
    }

}
