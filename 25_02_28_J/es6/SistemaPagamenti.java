package es6;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamenti {
    public static void main(String[] args){
        List <MetodoPagamento> metodi = new ArrayList<>();
        metodi.add(new PayPal(100.01));
        metodi.add(new CartaDiCredito(200.99));

        for(MetodoPagamento m : metodi){
            m.getCredito();
            m.effettuaPagamento(10.21);
            m.effettuaPagamento(1000000);
            m.getCredito();
        }
    }
}
