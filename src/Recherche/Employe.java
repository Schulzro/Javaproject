package Recherche;

public class Employe extends Personne {

    private int Salaire;

    public Employe(int Salaire, int Num, String Nom, String Prenom, int Tel, String Adresse) {
        super(Num, Nom, Prenom, Tel, Adresse);
        this.Salaire = Salaire;
    }

}
