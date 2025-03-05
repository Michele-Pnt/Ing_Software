package es6;

public class CartaDiCredito extends MetodoPagamento{
    
    public CartaDiCredito(double soldi) {
        super(soldi);
        System.out.println("Carta di credito creata con successo");
    }

    public void effettuaPagamento(double importo){
        if(importo > this.saldoDisponibile){
            System.err.println("Tentativo di addebito di" + importo + "ma il saldo è insufficiente");
        }else{
            this.saldoDisponibile -= importo;
            System.out.println("Pagamento contactLess di " + importo + " effettuato con successo");
        }
    }
    public void getCredito(){
        System.out.println("Il credito sulla carta di credito disponibile è di " + this.saldoDisponibile);
    }
}
