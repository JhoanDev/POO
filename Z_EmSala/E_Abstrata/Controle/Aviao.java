public class Aviao extends Aereo{
    private String cadAviao;


    public Aviao(int capacidade, String cadAnac, String cadAviao) {
        super(capacidade, cadAnac);
        this.cadAviao = cadAviao;
    }

    public void moverFrente() {
        System.out.println("Aviao move para frente");
    }

    @Override
    public String toString() {
        return "Aviao [" + super.toString() + ", cadAviao=" + cadAviao + "]";
    }

}