package app;

public class Application {
        public static void main(String[] args) {

                Ami ami1;
                Ami ami2;
                Ami ami3;

                ami1 = new Ami("Jean", 100);

                ami2 = new Ami("Lucien", 10);

                ami3 = new Ami("Gabriel", 1);

                

                System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBieres() + " bières.");
                System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBieres() + " bières.");
                System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBieres() + " bières.");

                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();

                System.out.println(ami1.getNom() + " peut encore boire " + ami1.getBieres() + " bières.");
                System.out.println(ami2.getNom() + " peut encore boire " + ami2.getBieres() + " bières.");
                System.out.println(ami3.getNom() + " peut encore boire " + ami3.getBieres() + " bières.");

        }
}
