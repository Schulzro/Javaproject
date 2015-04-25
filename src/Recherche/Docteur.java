package Recherche;

public class Docteur extends Employe {

    private String Specialite;

    private String metier;

    public Docteur(String Specialite, String metier, int Salaire, int Num, String Nom, String Prenom, int Tel, String Adresse) {
        super(Salaire, Num, Nom, Prenom, Tel, Adresse);
        this.Specialite = Specialite;
        this.metier = metier;
    }



  
}
