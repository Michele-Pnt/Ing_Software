package es6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayPal extends MetodoPagamento{
    public PayPal(double soldi) {
        super(soldi);
        System.out.println("Conto PayPal creato con successo");
    }

    public void effettuaPagamento(double importo){
        
        try {
            if(importo > this.saldoDisponibile){
                System.err.println("Tentativo di addebito di" + importo + "ma il saldo è insufficiente");
            }else{
                this.saldoDisponibile -= importo;
                System.out.println("Vuoi donare 1€ al WWF? (1 = si, 0 = no)");
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String donate;
                donate = in.readLine();
                if(donate.equals("1")){
                    this.saldoDisponibile -= 1;
                    System.out.println("Donazione a WWF effettuata con successo");
                }
                System.out.println("Pagamento Paypal di " + importo + " effettuato con successo");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void getCredito(){
        System.out.println("Il credito disponibile sul conto Paypal è di " + this.saldoDisponibile);
    }
}
