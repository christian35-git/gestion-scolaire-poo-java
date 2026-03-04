package model;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    private Long id;
    private String nomClasse;
    private String niveau;

    private List<Etudiant> etudiants = new ArrayList<Etudiant>();

    public Classe(Long id, String nomClasse, String niveau) {
        this.id = id;
        this.nomClasse = nomClasse;
        this.niveau = niveau;
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }
}
