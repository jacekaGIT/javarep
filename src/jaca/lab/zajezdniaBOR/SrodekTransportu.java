package jaca.lab.zajezdniaBOR;

import java.time.LocalDate;

public interface SrodekTransportu {


    // opis

    String getOpisSrodkaTransportu();
    void setOpisSrodkaTransportu(String opis);

    String getGlownyUzytkownik();
    void setGlownyUzytkownik(String uzytkownik);

    String getPreferowanaTrasa();
    void setPreferowanaTrasa(String niedaleko_oświęcimia);



    // stan techniczny

    Boolean getJestSprawny();
    void setJestSprawny (Boolean stan);

    String getPrzyczynaNiesprawnosci();
    void setPrzyczynaNiesprawnosci(String przyczyna);



    // stan rezerwacji

    Boolean getRezerwacjaCykliczna();
    void setRezerwacjaCykliczna(Boolean rezerwacja);

    Boolean getStanRezerwacji();
    void setStanRezerwacji(Boolean stanRezerwacji);
}
