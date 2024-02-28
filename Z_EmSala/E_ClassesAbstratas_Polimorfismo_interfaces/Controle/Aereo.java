public abstract class Aereo extends Veiculo {
    private String cadAnac;

    public Aereo(int capacidade, String cadAnac) {
        super(capacidade);
        this.cadAnac = cadAnac;
    }

    @Override
    public String toString() {
        return super.toString() + ", cadAnac=" + cadAnac;
    }

    
    
}