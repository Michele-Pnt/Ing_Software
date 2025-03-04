package es4;

public class Manager extends Dipendente{
    
    public Manager(String nome, int stipendio){
        super(nome);
        this.stipendio = stipendio;
    }

    @Override
    public int calcolaStipendio(){
        return this.stipendio + 500;
    }
}
