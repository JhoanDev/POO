public class EntradaEmAgenda {
    private String hora;
    private String dia;
    private String mes;
    private String ano;
    private String assunto;

    public EntradaEmAgenda(String hora, String dia, String mes, String ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(String dia, String mes, String ano) {
        if (dia.equals(this.dia) && mes.equals(this.mes) && ano.equals(this.ano)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano + ", Hora: " + hora + ", Assunto: " + assunto;
    }

}