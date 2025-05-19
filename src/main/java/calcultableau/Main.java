package calcultableau;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saisie des informations de l'utilisateur
        System.out.print("Prénom : ");
        String prenom = sc.nextLine();
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        UtilisateurTab utilisateur = new UtilisateurTab(prenom, nom, email);

        // Création de l'objet CalculTab pour stocker les notes
        CalculTab notes = new CalculTab();
        System.out.print("Nombre d étudiants : ");
        int n = sc.nextInt();

        // Saisie des notes des étudiants
        for (int i = 1; i <= n; i++) {
            System.out.print("Note de l étudiant " + i + " : ");
            int note = sc.nextInt();
            notes.ajouterNote(note);
        }

        // Affichage des résultats
        System.out.println("---- RÉSULTATS ----");
        System.out.println("Utilisateur : " + utilisateur.toStringBuilder());
        System.out.println("Date : " + LocalDate.now());
        System.out.println("Taille du tableau : " + notes.taille());
        System.out.printf("Moyenne : %.2f\n", notes.moyenne());
        System.out.printf("Médiane : %.2f\n", notes.mediane());
    }
}