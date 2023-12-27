public class Ufersa {
    public static void main(String[] args) {
        Aluno jhoan = new Aluno(7, "Jhoan Fernandes", 8.9, 9.7, 10);
        double mp = jhoan.media();
        double mf = jhoan.provaFinal();
        if (mf == 0.0) {
            if (mp >= 7) {
                System.out.println(jhoan + "\nMédia: " + mp + "\tAluno aprovado.");
            } else {
                System.out.println(jhoan + "\nMédia: " + mp + "\tAluno reprovado.");
            }
        } else {
            if (mf >= 5) {
                System.out.println(jhoan + "\nMédia final: " + mf + "\tAluno aprovado na prova final.");
            } else {
                System.out.println(jhoan + "\nMédia final: " + mf + "\tAluno reprovado na prova final.");
            }
        }
    }
}
