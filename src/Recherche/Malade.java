package Recherche;

public class Malade extends Personne {

    private String mutuelle;

    public Malade(String mutuelle, int Num, String Nom, String Prenom, int Tel, String Adresse) {
        super(Num, Nom, Prenom, Tel, Adresse);
        this.mutuelle = mutuelle;
    }
    
    
}
