public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualOTitulo() {
        return this.titulo;
    }

    public String qualOAutor() {
        return this.autor;
    }

    public String toString() {
        return String.format("Titulo: %s\tAutor: %s\t%dpag\t(%d)", titulo, autor, numeroDePaginas, anoDaEdicao);
    }

}
