package Recherche;

public class Infirmier  extends Employe {

    private boolean Rotation;

    private int Code_Service;

    private int No_Infirmier;

    public Infirmier(boolean Rotation, int Code_Service, int No_Infirmier, int Salaire, int Num, String Nom, String Prenom, int Tel, String Adresse) {
        super(Salaire, Num, Nom, Prenom, Tel, Adresse);
        this.Rotation = Rotation;
        this.Code_Service = Code_Service;
        this.No_Infirmier = No_Infirmier;
    }
    
    
}
