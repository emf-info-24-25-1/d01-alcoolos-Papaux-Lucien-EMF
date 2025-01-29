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

    public int getBières() {
        return nombreDeBiereSupportable;
    }

    int biere = 1000;

    public static void boitUneBiere(){
        if (biere > 0) {
            biere--; // L'ami boit une bière, donc on décrémente le nombre de bières
            System.out.println(nom + " a bu une bière ! Il lui reste " + biere + " bières.");
        } else {
            System.out.println(nom + " ne peut plus boire de bières, il est déjà saoul.");
        }
    }


}
