package app;

public class Ami {

    // atribut
    private String nom;
    private int nombreDeBiereSupportable;

    // Constructeur
    public Ami(String nom, int nombreDeBiereSupportable) {
        this.nom = nom;
        this.nombreDeBiereSupportable = nombreDeBiereSupportable;
    }

    // méthode
    public void boitUneBiere() {
        if (nombreDeBiereSupportable > 0) {
            nombreDeBiereSupportable--;
            System.out.println(nom + " boit une bière ");
        } else {
            System.out.println(nom + " ne peut plus boire de bières ");
        }
        nombreDeBiereSupportable--;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public int getNmbreBieresSupportable() {
        return nombreDeBiereSupportable;
    }

    public void setNmbreBieresSupportable(int nombreDeBiereSupportable) {
        this.nombreDeBiereSupportable = nombreDeBiereSupportable;
    }

}
