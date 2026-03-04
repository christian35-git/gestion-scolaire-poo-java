import java.util.Scanner;
import model.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("prenom:");
        String prenom = sc.nextLine();

        System.out.print("role : ");
        String role = sc.nextLine();

        if (role.equals("admin")) {

            Classe classe = new Classe(1L,"L3 Informatique","Licence3");

            Etudiant e1 = new Etudiant(1L, "Jean","Paul","jean@gmail.com",
                    "1234","admin","M001");

            Professeur prof = new Professeur(2L,"Rakoto","Pierre","prof@gmail.com",
                    "1234","professeur","Java");

            Cours java = new Cours(1L,"Java",4);
            Cours reseau = new Cours(2L,"Réseau",2);

            prof.ajouterNote(e1, java,15);
            prof.ajouterNote(e1, java, 10);

            e1.afficherProfil();

        } else if (role.equals("professeur")) {

        } else {

        }
    }
    }
