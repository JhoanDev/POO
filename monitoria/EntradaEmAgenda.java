package monitoria;

public class EntradaEmAgenda {
    private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if (this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("%d/%d/%d:%d\tAssunto:%s", dia, mes, ano, hora, assunto);
    }
}