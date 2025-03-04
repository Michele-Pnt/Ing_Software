package es4;

public class Impiegato extends Dipendente{

    public Impiegato(String nome, int stipendio){
        super(nome);
        this.stipendio = stipendio;
    }

    @Override
    public int calcolaStipendio(){
        return this.stipendio;
    }
}
