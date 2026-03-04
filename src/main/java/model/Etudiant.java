package model;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Utilisateur{

    private String matricule;
    private List<Note> notes = new ArrayList<Note>();

    public Etudiant(Long id, String nom, String prenom, String email, String password,
                    String role, String matricule ) {
        super(id, nom, prenom, email, password, role);
        this.matricule = matricule;
    }

    public void ajouterNote(Note note) {
        notes.add(note);
    }

    public double calculerMoyenne() {

        if (notes.isEmpty()) return 0;

        double somme = 0.0;
        int totalCoefficient = 0;

        for (Note note : notes) {
            int coef = note.getCours().getCoefficient();
            somme += note.getValeur() * coef;
            totalCoefficient += coef;
        }
        return somme / totalCoefficient;
    }

    @Override
    public void afficherProfil() {
        System.out.println("Etudiant " + nom + " " + prenom);
        System.out.println("Moyenne : " + calculerMoyenne());
    }

    // Vérifier si l'étudiant a déjà une note pour ce cours
    public boolean aDejaNotePourCours(Cours cours) {
        for (Note note : notes) {
            if(note.getCours().equals(cours)) {
                return true;
            }
        }
        return false;
    }
}
