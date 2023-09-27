package models;

public class Emp {
    private String nom;
    private String prenom;

    public String getnom()
    {
        return this.nom;
    }
    public String getprenom()
    {
        return this.prenom;
    }
    public void setnom(String nom)
    {
        this.nom=nom;
    }
    public void setprenom(String prenom)
    {
        this.prenom=prenom;
    }
    public Emp(String nom,String prenom)
    {
        this.setnom(nom);
        this.setprenom(prenom);
    }
    public Emp(){

    }

    public static Emp checkEmp(String nom,String prenom)
    {
        Emp profil=new Emp(nom,prenom);
        return profil;
    }
}