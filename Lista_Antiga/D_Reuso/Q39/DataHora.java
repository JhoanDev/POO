public class DataHora {
    private String hora;
    private String dia;
    private String mes;
    private String ano;

    public DataHora(String hora, String dia, String mes, String ano) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString(){
        return dia + "/" + mes + "/" + ano + ", Hora: " + hora;
    }
}