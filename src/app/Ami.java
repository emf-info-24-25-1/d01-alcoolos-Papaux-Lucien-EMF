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

    

    public void boitUneBiere() { //bizzare qu'il n'y ai pas besoin du static
        if (nombreDeBiereSupportable > 0) {
            nombreDeBiereSupportable--;
            System.out.println(nom + " a bu une bière !");
        } else if (nombreDeBiereSupportable == 0) {
            System.out.println(nom + " ne peut plus boire de bière, il est déjà saoul !");
        }
    }


}
