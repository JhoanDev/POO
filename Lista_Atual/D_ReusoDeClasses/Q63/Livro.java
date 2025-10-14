public class Livro {

    private String autor;
    private String titulo;
    private int ano;
    private int edicao;

    public Livro(String autor, String titulo, int ano, int edicao) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return String.format("Autor: %s\tTitulo: %s\tAno: %d\tEdicao: %d", autor, titulo, ano, edicao);
    }
}