package Lista_Atual.G_ClassesAbstratas_Polimorfismo_Interfaces.Q72;

public class Main {
    public static void main(String[] args) {
        Funcionario lenilson = new Funcionario("Lenilson"); 
        Funcionario vladmir = new Funcionario("Vladimir", 32, 4.5); 

        System.out.println(lenilson + " Valor semanal: " + lenilson.calculaSalarioSemanal());
        System.out.println(vladmir + " Valor semanal: " + vladmir.calculaSalarioSemanal());
    }
}
