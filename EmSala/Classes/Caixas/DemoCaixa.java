public class DemoCaixa {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco(1);
        CaixaBanco caixa2 = new CaixaBanco(2);
        CaixaBanco caixa3 = new CaixaBanco(3);
        CaixaBanco caixa4 = new CaixaBanco(4);
        CaixaBanco caixa5 = new CaixaBanco(5);

        caixa1.inciarAtendimento();
        caixa2.inciarAtendimento();
        caixa3.inciarAtendimento();
        caixa4.inciarAtendimento();
        caixa5.inciarAtendimento();
    }
}
