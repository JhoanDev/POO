public class Equipamento {
    private String mouse;
    private String teclado;

    public Equipamento(String mouse, String teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String toString(){
        String res = "Equipamentos\n";
        res += "Tipo do teclado: " + teclado + "\n";
        res += "Tipo do mouse: " + mouse;
        return res; 
    }
}