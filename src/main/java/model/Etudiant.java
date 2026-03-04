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
        System.out.println("Mention : " + getMention().getLabel());
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

    public Mention getMention() {

        double moyenne = calculerMoyenne();

        if (moyenne < 10) return Mention.AJOURNE;
        else if (moyenne < 12) {
            return Mention.PASSABLE;
        } else if (moyenne < 14) {
            return Mention.ASSEZ_BIEN;
        }
        else if (moyenne < 16) {
            return Mention.BIEN;
        }
        else {
            return Mention.TRES_BIEN;
        }
    }
}
