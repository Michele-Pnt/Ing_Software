package es5;

public class ViaggioTreno extends Viaggio{
    protected String compagnia;
    protected String stazionePartenza;
    protected String stazioneArrivo;
    protected int carrozza;

    public ViaggioTreno(String dest, int pri, String comp, String part, String arr, int carr){
        super(dest, pri);
        this.compagnia = comp;
        this.stazionePartenza = part;
        this.stazioneArrivo = arr;
        this.carrozza = carr;
    }

    @Override
    public void descrizione() {
        System.out.println("Compagnia: " + compagnia);
        System.out.println("Stazione di Partenza: " + stazionePartenza);
        System.out.println("Stazione di Arrivo: " + stazioneArrivo);
        System.out.println("Carrozza: " + carrozza);
    }
}
