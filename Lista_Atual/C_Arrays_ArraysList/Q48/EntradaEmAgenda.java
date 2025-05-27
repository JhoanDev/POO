public class EntradaEmAgenda {
    private final String hora;
    private final int dia;
    private final int mes;
    private final int ano;
    private final String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return (dia == this.dia && mes == this.mes && ano == this.ano);
    }

    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        if (this.dia < 10)
            saida.append("0");
        saida.append(this.dia);
        saida.append("/");
        if (this.mes < 10)
            saida.append("0");
        saida.append(this.mes);
        saida.append("/");
        saida.append(this.ano);
        saida.append(":");
        saida.append(this.hora);
        saida.append(" -> ");
        saida.append(this.assunto);
        return saida.toString();
    }
}