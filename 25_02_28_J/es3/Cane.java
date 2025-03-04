package es3;
public class Cane extends AnimaleBase {
    public Cane(String nome){
        super(nome);
    }

    @Override
    public void emettiVerso(){
        System.out.println((nome + " dice BAU BAU!"));
    }

    @Override
    public void muoviti(){
        System.out.println((nome + "Corre!"));
    }
}
