

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialeBibliotecario> materiali;

    public Biblioteca() {
        materiali = new ArrayList<>();
    }

    public void aggiungiMateriale(MaterialeBibliotecario materiale) {
        materiali.add(materiale);
    }

    public void rimuoviMateriale(MaterialeBibliotecario materiale) {
        materiali.remove(materiale);
    }

    public void visualizzaMateriali() {
        for (MaterialeBibliotecario materiale : materiali) {
            System.out.println(materiale.getDettagli());
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Il Signore degli Anelli", 1954, "J.R.R. Tolkien");
        Rivista rivista1 = new Rivista("Sopravvivenza a UNIFE", 2025, 1);

        biblioteca.aggiungiMateriale(libro1);
        biblioteca.aggiungiMateriale(rivista1);

        biblioteca.visualizzaMateriali();

        biblioteca.rimuoviMateriale(libro1);

        System.out.println("Dopo la rimozione:");
        biblioteca.visualizzaMateriali();
    }
}
