public class LivroLivraria extends Livro{
    private float preco;

    LivroLivraria(float preco, String autor, String titulo, int ano, int edicao){
        super(autor, titulo, ano, edicao);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("%s\t%fR$", super.toString(), preco);
    }
}
