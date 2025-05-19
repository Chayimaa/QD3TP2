package calcultableau;

// Classe représentant un utilisateur
public class UtilisateurTab {
    private String prenom; 
    private String nom;   
    private String email;  

    // Constructeur pour initialiser les champs de l'utilisateur
    public UtilisateurTab(String prenom, String nom, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
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