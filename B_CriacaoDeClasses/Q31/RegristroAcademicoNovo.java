public class RegristroAcademicoNovo {
    private static int numeroDeMatriculas;
    private String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public RegristroAcademicoNovo(String nome, int codigoCurso, double percentualDeCobranca) {
        this.nome = nome;
        this.matricula = numeroDeMatriculas+1000;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobranca = percentualDeCobranca;
        numeroDeMatriculas++;
    }

    public static int getTotalDeMatriculas(){
        return numeroDeMatriculas;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }

    public String toString(){
        return ("Nome: " + nome + "\nMatricula: " + matricula + "\nCódigo: " + codigoCurso + "\nMensalidade: " + calculaMensalidade());
    }
}
