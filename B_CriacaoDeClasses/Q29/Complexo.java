public class Complexo {
    private double real;
    private String imaginario;

    public Complexo(double real) {
        this.real = real;
        this.imaginario = "";
    }

    public Complexo() {
        this.real = 0.0;
        this.imaginario = "";
    }

    public Complexo(double real, String imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        if (imaginario.isEmpty() && real == 0.0) {
            return "Complexo [ " + real + " ]";
        }
        else if (real == 0.0) {
            return "Complexo [ " + imaginario + " ]";
        }
        else if (imaginario.isEmpty()) {
            return "Complexo [ " + real + " ]";
        }
        else{
            return "Complexo [ " + real + " + " + imaginario + " ]";
        }
    }
}