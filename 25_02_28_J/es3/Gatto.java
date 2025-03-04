package es3;
public class Gatto extends AnimaleBase {
    
    public Gatto(String nome){
        super(nome);
    }

    @Override
    public void emettiVerso(){
        System.out.println(nome +"dice MAIO MIAO!");
    }

    @Override
    public void muoviti(){
        System.out.println((nome + "si arrampica!"));
    }
}
