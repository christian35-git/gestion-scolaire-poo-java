package model;

public abstract class Utilisateur {

    protected Long id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String password;
    protected String role;

    public Utilisateur(Long id, String nom, String prenom, String email, String password, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void Login(String email, String password) {
        System.out.println("Bienvenue " + nom);
    }

    public void Logout() {
        System.out.println("Utilisateur logout");
    }

    public abstract void afficherProfil();

}
