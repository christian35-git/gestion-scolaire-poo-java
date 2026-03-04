package model;

public class Admin extends Utilisateur{

    public Admin(Long id, String nom, String prenom,String email,String password,String role) {
        super(id, nom, prenom, email, password, role);
    }

    public void ajouterEtudiant(Classe classe, Etudiant etudiant) {
        classe.ajouterEtudiant(etudiant);
    }

    @Override
    public void afficherProfil() {
        System.out.println("Admin " + prenom );
    }
}
