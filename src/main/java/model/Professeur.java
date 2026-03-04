package model;

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Utilisateur {

    private String specialite;
    private List<Classe> classes = new ArrayList<Classe>();

    public Professeur(Long id,String nom, String prenom, String email, String password, String role, String specialite) {
        super(id,nom,prenom,password,email, role);
        this.specialite = specialite;
    }

    public void ajouterClasse(Classe classe) {
        classes.add(classe);
    }

    public void ajouterNote(Etudiant e, Cours cours, double valeur) {

        if (e.aDejaNotePourCours(cours)) {
            System.out.println("L'étudiant a déjà une note pour le cours : " + cours.getNom());
            return;
        }

        Note note = new Note(System.currentTimeMillis(), valeur, cours);
        e.ajouterNote(note);

        System.out.println("Note ajoutée avec sucès ! ");
    }

    @Override
    public void afficherProfil() {
        System.out.println("Professeur " + prenom + " " + specialite);
    }
}
