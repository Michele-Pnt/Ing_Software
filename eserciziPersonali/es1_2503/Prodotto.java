package Ing_Software.eserciziPersonali.es1_2503;

public class Prodotto {
    private int id;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int quantita;

    public Prodotto(int id, String nome, String descrizione, double prezzo, int quantita){
        this.descrizione = descrizione;
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }
    public void aggiornareStock(int qta){
        this.quantita -= qta;
    }
}
