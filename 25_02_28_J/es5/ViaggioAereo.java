package es5;

public class ViaggioAereo extends Viaggio{
    protected String compagnia;
    protected String aeroportoPartenza;
    protected String aeroportoArrivo;
    protected int numeroPosti;

    public ViaggioAereo(String dest, int pri, String comp, String part, String arr, int posti){
        super(dest, pri);
        this.compagnia = comp;
        this.aeroportoPartenza = part;
        this.aeroportoArrivo = arr;
        this.numeroPosti = posti;
    }

    @Override
    public void descrizione() {
        System.out.println("Compagnia: " + compagnia);
        System.out.println("Aeroporto di Partenza: " + aeroportoPartenza);
        System.out.println("Aeroporto di Arrivo: " + aeroportoArrivo);
        System.out.println("Numero di Posti: " + numeroPosti);
    }

}
