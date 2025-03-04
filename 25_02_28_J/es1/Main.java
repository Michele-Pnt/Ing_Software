import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veicolo> veicoli = new ArrayList<>();

        veicoli.add(new Auto("AB123CD"));
        veicoli.add(new Moto("EF456GH"));
        veicoli.add(new Auto("IJ789KL"));
        veicoli.add(new Moto("MN012OP"));

        for (Veicolo veicolo : veicoli) {
            veicolo.avvia();
        }

        System.out.println("Tutti i veicoli sono stati avviati.");

        for (Veicolo veicolo : veicoli) {
            veicolo.ferma();
        }

        System.out.println("Tutti i veicoli sono stati fermati.");
    }
}