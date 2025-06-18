import Prijmeni3Da.Pokus;

public class Main {

    public static void main(String[] args) {


        //moje jmeno a prijemeni je Jiri Kubala
        System.out.println("Neco na github...");

        int vysledek = Matika.secist(10,2);
        System.out.println("soucet je " + vysledek);

        vysledek = Matika.odecist(10,2);
        System.out.println("rozdil je " + vysledek);

        vysledek = Matika.vynasobit(10,2);
        System.out.println("soucin je " + vysledek);

        double vysledekD = Matika.vydelit(10,2);
        System.out.println("podil je " + vysledekD);

        System.out.println("Jmeno a prijmeni je: " + Pokus.jmenoPrijmeni);

        System.out.println("Jiri Kubala");


    }
}
