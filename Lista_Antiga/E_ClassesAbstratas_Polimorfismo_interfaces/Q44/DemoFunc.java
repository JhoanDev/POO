public class DemoFunc {
    public static void main(String[] args) {
        FuncionarioEmp func1 = new FuncionarioEmp("Jhoan");
        FuncionarioEmp func2 = new FuncionarioEmp("Heitor");

        func1.setSalarioPorHora(7.5);
        func2.setIdade(20);

        System.out.println(func1);
        System.out.println("Salario: " + func1.salarioMensal(100) + "\n");

        System.out.println(func2);
        System.out.println("Salario: " + func2.salarioMensal(180) + "\n");
    }
}
