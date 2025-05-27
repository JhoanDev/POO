public class DemoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur");
        System.out.println(conta1);   
        
        ContaBancaria conta2 = new ContaBancaria("Aline", 1234.89, true);
        System.out.println(conta2);
    }
}