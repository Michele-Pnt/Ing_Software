package es6;

public abstract class MetodoPagamento implements Pagabile {
    protected double saldoDisponibile;
    public MetodoPagamento(double saldo){
        this.saldoDisponibile = saldo;
    }

    public abstract void effettuaPagamento(double importo);
    public abstract void getCredito();
}
