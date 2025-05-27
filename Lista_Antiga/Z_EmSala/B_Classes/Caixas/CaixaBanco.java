public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos = 0;

    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
        System.out.println("Caixa: " + numeroCaixa + " inicializado");
    }

    public void inciarAtendimento() {
        System.out.println("Caixa: " + this.numeroCaixa + " atendeu o cliente " + (clientesAtendidos + 1));
        clientesAtendidos++;
    }
}
