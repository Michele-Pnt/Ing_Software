public class Moto extends MezzoDiTrasporto {
    public Moto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("Moto con targa " + targa + " avviata.");
    }

    @Override
    public void ferma() {
        System.out.println("Moto con targa " + targa + " fermata.");
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}