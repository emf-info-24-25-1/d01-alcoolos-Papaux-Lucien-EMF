package app;

public class Ami {
    private String nom;
    private int nombreDeBiereSupportable;

    public Ami(String nom, int nombreDeBiereSupportable){
        this.nom = nom;
        this.nombreDeBiereSupportable = nombreDeBiereSupportable;
    }

    public String getNom() {
        return nom;
    }

    public int getBieres() {
        return nombreDeBiereSupportable;
    }

    int biere = 1000;

    public void boitUneBiere() {
        if (nombreDeBiereSupportable > 0) {
            nombreDeBiereSupportable--;
            System.out.println(nom + " a bu une bière !");
        } else {
            System.out.println(nom + " ne peut plus boire de bière, il est déjà saoul !");
        }
    }


}
