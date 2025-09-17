package Lista_Atual.B_CriacaoDeClasses.Q32;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Pedro", 7.0, 8.0, 9.0);
        Aluno a2 = new Aluno(2, "Jhoan", 2.0, 4.1, 6.4);
        Aluno a3 = new Aluno(3, "Lucas", 1.0, 2.0, 0.0);

        System.out.println("Aluno 1 precisa de: " + a1.provaFinal());
        System.out.println("Aluno 2 precisa de: " + a2.provaFinal());
        System.out.println("Aluno 3 precisa de: " + a3.provaFinal());

    }
}
