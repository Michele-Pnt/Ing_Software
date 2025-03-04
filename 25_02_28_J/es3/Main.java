package es3;
import java.util.ArrayList;
import java.util.List;

public class Main {

    

    public static void main(String[] args){
        List<AnimaleBase> animali = new ArrayList<AnimaleBase>();

        Cane cane = new Cane ("Raul");
        Cane cane2 = new Cane ("Diva");
        Gatto gatto = new Gatto ("Micio");
        
        animali.add(cane);
        animali.add(cane2);
        animali.add(gatto);

        System.out.println("\n versi: \n");
        animali.get(0).emettiVerso();
        animali.get(2).emettiVerso();
        System.out.println("\n movimenti: \n");
        animali.get(0).muoviti();   
        animali.get(2).muoviti();
    }
}
