package calcultableau;

import java.util.regex.Pattern;

// Classe représentant un utilisateur
public class UtilisateurTab {
    private String prenom; 
    private String nom;   
    private String email;  

    // Constructeur pour initialiser les champs de l'utilisateur
      public UtilisateurTab(String prenom, String nom, String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email non valide");
        }
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches("[\\w.-]+@[\\w.-]+\\.[a-z]{2,}", email);
    }

    // Méthode qui construit une chaîne qui repésente l'utilisateur 
    public String toStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append(prenom)
          .append(", ")
          .append(nom)
          .append(", ")
          .append(email);
        return sb.toString();
    }
}