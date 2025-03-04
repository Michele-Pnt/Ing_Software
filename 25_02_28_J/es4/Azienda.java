package es4;

import java.util.ArrayList;
import java.util.List;

public class Azienda {

    public static void main(String[] args){
        List<Dipendente> dipendenti = new ArrayList<>();

        dipendenti.add(new Impiegato("giovanni", 1500));
        dipendenti.add(new Manager("marco", 2000));

        for(Dipendente d: dipendenti){
            System.out.println("Lo stipendio di: "+ d.getNome() + "ammonta a: " + d.calcolaStipendio());
        }
    }
}
