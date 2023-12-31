public class RegristroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegristroAcademico(String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }

    public String toString(){
        return ("Nome: " + nome + "\nMatricula: " + matricula + "\nCódigo: " + codigoCurso + "\nMensalidade: " + calculaMensalidade());
    }
}
