package es5;

public abstract class Viaggio {
    protected String destinazione;
    protected int prezzo;

    public Viaggio(String dest, int pr){
        this.destinazione = dest;
        this.prezzo = pr;
    }

    public abstract void descrizione();
}
