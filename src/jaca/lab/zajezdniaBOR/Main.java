package jaca.lab.zajezdniaBOR;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        out.println("\nZ braku lepszego pomysłu... zainspirowany kabaretem....długimi nazwami...\n" +
                "... i dobrą zmianą...... i dziennikarzami... i wybrańcami narodu....\n" +
                "... niekoniecznie zdrów na ciele... i na umyśle..... popełniłem...wbrew zaleceniom ... po polsku.....\n\n" +
                "      ***** PROGRAM DO OBSŁUGI ZAJEZDNI BOR (beta version 0.00.01) *****    ;)\n" +
                "-----------------------------------------------------------------------------\n\n");


        SrodekTransportu samochodOpancerzonyDoDomu = new LimuzynaOpancerzona();
        //-------------------------
        samochodOpancerzonyDoDomu.setGlownyUzytkownik("Tak to ONA\t\t\t\t");
        samochodOpancerzonyDoDomu.setPreferowanaTrasa("Niedaleko Oświęcimia");
        samochodOpancerzonyDoDomu.setJestSprawny(false);
        samochodOpancerzonyDoDomu.setPrzyczynaNiesprawnosci("czyżby małolat w Seicento? ... no nie ... litości");


        SrodekTransportu samochodOpancerzonyNaNarty = new LimuzynaOpancerzona();
        //-------------------------
        samochodOpancerzonyNaNarty.setGlownyUzytkownik("Adrian\t\t\t\t\t");
        samochodOpancerzonyNaNarty.setPreferowanaTrasa("Karpacz, Zakopane, byle dalej od SAM WIESZ KOGO");
        samochodOpancerzonyNaNarty.setJestSprawny(false);
        samochodOpancerzonyNaNarty.setPrzyczynaNiesprawnosci("bezdomny wiedział ... ale już nie powie");


        //teraz powinna być jeszcze jedna limuzyna na trasę STOLICA - TORUN - STOLICA ale się boję


        SrodekTransportu transportDlaSamWieszKogo = new LektykaBardzoChroniona();
        //-------------------------
        transportDlaSamWieszKogo.setGlownyUzytkownik("SAM WIESZ KTO\t\t\t");
        transportDlaSamWieszKogo.setPreferowanaTrasa("po 'stolycy' to tu to tam");
        transportDlaSamWieszKogo.setJestSprawny(true);      // musi być !!!
        transportDlaSamWieszKogo.setStanRezerwacji(true);
        transportDlaSamWieszKogo.setRezerwacjaCykliczna(true);



        SrodekTransportu transportNaCzarnaGodzine = new SamolotArkaDlaWybrancow();
        //-------------------------
        transportNaCzarnaGodzine.setGlownyUzytkownik("cała ekipa dobrej zmainy");
        transportNaCzarnaGodzine.setPreferowanaTrasa("San Escobar");
        transportNaCzarnaGodzine.setJestSprawny(true);      // żeby się tylko nie zepsuł

        out.println("\n------------------------------------------\n");
        //out.println(transportNaCzarnaGodzine.getGlownyUzytkownik());


        //-------------------------
        List<SrodekTransportu> listaWaznychSrodkowTransportu = new ArrayList<>();
        //-------------------------
        listaWaznychSrodkowTransportu.add(samochodOpancerzonyDoDomu);
        listaWaznychSrodkowTransportu.add(samochodOpancerzonyNaNarty);
        listaWaznychSrodkowTransportu.add(transportDlaSamWieszKogo);
        listaWaznychSrodkowTransportu.add(transportNaCzarnaGodzine);

        int i = 0;
        for (SrodekTransportu wozidloNosidloLatadlo : listaWaznychSrodkowTransportu) {
            ++i;
            out.print(i + ".\tDla Kogo Wozidło Nosidło Latadło? :\t\t");
            out.print(wozidloNosidloLatadlo.getGlownyUzytkownik());
            out.print("\t REZERWACJA = \t");
            out.print(wozidloNosidloLatadlo.getStanRezerwacji());
            out.print("\t CYKLICZNA = \t");
            out.println(wozidloNosidloLatadlo.getRezerwacjaCykliczna());
        }

    }
}
