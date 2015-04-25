package Recherche;

public class Hospitalisation {

    private int No_malade;

    private int Code_Service;

    private int No_Chambre;

    private int No_Lit;

    private int DureeHospitalisation;

    private int debuthospitalisation;

    private int finhospitalisation;

    public Hospitalisation(int No_malade, int Code_Service, int No_Chambre, int No_Lit, int DureeHospitalisation, int debuthospitalisation, int finhospitalisation) {
        this.No_malade = No_malade;
        this.Code_Service = Code_Service;
        this.No_Chambre = No_Chambre;
        this.No_Lit = No_Lit;
        this.DureeHospitalisation = DureeHospitalisation;
        this.debuthospitalisation = debuthospitalisation;
        this.finhospitalisation = finhospitalisation;
    }
    
    
}
