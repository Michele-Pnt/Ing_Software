
public class Rivista extends MaterialeBibliotecario {
    private int numeroEdizione;

    public Rivista(String titolo, int annoPubblicazione, int numeroEdizione) {
        super(titolo, annoPubblicazione);
        this.numeroEdizione = numeroEdizione;
    }

    public int getNumeroEdizione() {
        return numeroEdizione;
    }

    @Override
    public String getDettagli() {
        return "Rivista: " + titolo + ", Numero Edizione: " + numeroEdizione + ", Anno: " + annoPubblicazione;
    }
}
