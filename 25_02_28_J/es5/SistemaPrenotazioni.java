package es5;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioni {

    public static void main(String[] args){
        List <Viaggio> viaggi = new ArrayList<>();
        System.out.println("aggiugno viaggi\n");
        viaggi.add(new ViaggioAereo("parigi", 100, "ryanair", "BLQ", "BVA", 200));
        viaggi.add(new ViaggioTreno("bari", 20, "trenitalia", "bologna", "bari", 1));
        System.out.println("descrizione viaggii\n");
        for (Viaggio viaggio : viaggi) {
            viaggio.descrizione();
            System.out.println("\n");
        }
    }
}
