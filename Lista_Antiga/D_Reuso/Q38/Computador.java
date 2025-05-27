public class Computador extends Equipamento{
    private String processador;
    private String placaDeVideo;
    
    public Computador(String mouse, String teclado, String processador, String placaDeVideo) {
        super(mouse, teclado);
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String toString(){
        String res = "===PersonalComputer===\n" + super.toString() + "\npecas do computador\n";
        res += "Tipo do processador: " + processador + "\n";
        res += "Tipo da placa de video: " + placaDeVideo + "\n";
        return res;
    }
}