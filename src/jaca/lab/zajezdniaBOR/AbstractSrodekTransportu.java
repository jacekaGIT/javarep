package jaca.lab.zajezdniaBOR;

import static java.lang.System.out;

public abstract class AbstractSrodekTransportu implements SrodekTransportu {

    public AbstractSrodekTransportu(){
        out.println("QQQQQQQQQQQQ <- to ta zmaina ### Bezdomny z Warszawy podarował nowy środek transportu ;)....  "
                + getTypSrodkaTransportu());
    }

    private String opisSrodkaTransportu;
    private String glownyUzytkownik;
    private String preferowanaTrasa;
    private Boolean jestSprawny;
    private String przyczynaNiesprawnosci;

    private Boolean stanRezerwacji;
    private Boolean rezerwacjaCykliczna;
    //private int okresRezerwacjiCyklicznej;



    //-------------------------
    public abstract String  getTypSrodkaTransportu();



    //-------------------------
    @Override
    public String getOpisSrodkaTransportu() { return this.opisSrodkaTransportu;}

    @Override
    public void setOpisSrodkaTransportu(String opis) { this.opisSrodkaTransportu = opis;}

    //-------------------------
    @Override
    public String getGlownyUzytkownik() { return this.glownyUzytkownik;}

    @Override
    public void setGlownyUzytkownik(String uzytkownik) { this.glownyUzytkownik = uzytkownik;}

    //-------------------------
    @Override
    public String getPreferowanaTrasa() { return this.preferowanaTrasa;}

    @Override
    public void setPreferowanaTrasa(String prefTrasa) { this.preferowanaTrasa = prefTrasa;}

    //-------------------------
    @Override
    public Boolean getJestSprawny() { return jestSprawny; }

    @Override
    public void setJestSprawny(Boolean stan) { this.jestSprawny = stan;}

    //-------------------------
    @Override
    public String getPrzyczynaNiesprawnosci() { return this.przyczynaNiesprawnosci;}

    @Override
    public void setPrzyczynaNiesprawnosci(String przyczyna) { this.przyczynaNiesprawnosci = przyczyna;}

    //-------------------------
    @Override
    public Boolean getStanRezerwacji() {
        return stanRezerwacji;
    }

    @Override
    public void setStanRezerwacji(Boolean stanRezerwacji) {
        this.stanRezerwacji = stanRezerwacji;
    }

    //-------------------------
    @Override
    public Boolean getRezerwacjaCykliczna() {
        return rezerwacjaCykliczna;
    }

    @Override
    public void setRezerwacjaCykliczna(Boolean rezerwacjaCykliczna) {
        this.rezerwacjaCykliczna = rezerwacjaCykliczna;
    }
}
