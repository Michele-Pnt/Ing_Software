package es4;

public abstract class Dipendente {
    protected String nome;
    protected int stipendio;
    public abstract int calcolaStipendio();

    public Dipendente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
