package app;

public class Application {
        public static void main(String[] args) {

                // Déclaration d'un objet de type Ami
                Ami ami1;
                Ami ami2;
                Ami ami3;

                //Instanciation de l'objet
                ami1 = new Ami("Jean", 100);

                ami2 = new Ami("Lucien", 10);

                ami3 = new Ami("Gabriel", 1);

                //Utilisation de la méthode boitUneBiere

                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();
                
                System.out.println("Le nombre de bière supportable pour " + ami1.getNom() + " est de " + ami1.getNmbreBieresSupportable());
                System.out.println("Le nombre de bière supportable pour " + ami2.getNom() + " est de " + ami2.getNmbreBieresSupportable());
                System.out.println("Le nombre de bière supportable pour " + ami3.getNom() + " est de " + ami3.getNmbreBieresSupportable());
                

        }
}
