public class LivroBiblioteca extends Livro {
    private boolean emprestado;

    public LivroBiblioteca(String autor, String titulo, int ano, int edicao, boolean emprestado) {
        super(autor, titulo, ano, edicao);
        this.emprestado = emprestado;
    }
    
    @Override
    public String toString() {
        return String.format("%s -> %s", super.toString(),(emprestado?"(Emprestado)":"(Livre)"));
    }
}
