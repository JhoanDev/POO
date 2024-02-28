public class DemoPagamento {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(156.27, 7);
        EmpregadoAssalariado empregado = new EmpregadoAssalariado("Jhoan", "7832981", 15983.4);
        custoPagamento(empregado);
        custoPagamento(fatura);
    }
    
    public static void custoPagamento(Pagavel pagavel){
        System.out.println("Custo do pagamento: " + pagavel.obterPagamento());
    }
}