public class DemoRH {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jhoan", "1236437");
        Funcionario funcionario = new Funcionario("Julia", "1235467", 1544.5);
        ChefeDeDepartamento chefe = new ChefeDeDepartamento("Petrucio", "6346868", 15836.8, "Financeiro" );
        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(chefe);
    }
    
}