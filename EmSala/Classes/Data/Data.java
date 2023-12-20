public class Data {
    private int dia;
    private int mes;
    private int ano;

    private Boolean dataValida(){
        return (dia >= 1 && dia <=30 && mes>=1 && mes <= 12 && ano >= 0);
    }

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        dia = a;
        if (dataValida()) {
            dia = 1;
            mes = 1;
            ano = 1971;
        }
    }

    public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}