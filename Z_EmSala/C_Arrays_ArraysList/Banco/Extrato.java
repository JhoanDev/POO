import java.util.ArrayList;

public class Extrato {
    private double saldo;
    private ArrayList<Double> transacoes;

    public Extrato() {
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void deposito(double valor){
        if (valor < 0) {
            System.out.println("Não é possivel fazer deposito negativo");
        }
        else{
            saldo += valor;
            transacoes.add(valor);
        }
    }
    public void saque(double valor){
        if (valor < 0) {
            System.out.println("Não é possivel fazer saque negativo");
        }
        else if (saldo >= valor){
            saldo += -valor;
            transacoes.add(-valor);
        }
        else{
            System.out.println("Não foi possivel realizar o saque.");
        }
    }

    public void vizualizarExtrato(){
        for(int i = 0; i < transacoes.size(); i++){
            System.out.printf("Transação #%d -> ", i+1);
            if (transacoes.get(i) > 0) {
                System.out.println("Deposito de: " + transacoes.get(i) + " $");
            }
            else{
                System.out.println("Saque de: " + -transacoes.get(i) + " $");
            }
        }
        System.out.println("Saldo: " + saldo);
    }
}