public class LivroB {
    private String titulo;
    private String autor;
    private String editora;
    private int ano;

    public LivroB(String titulo, String autor, String editora, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String qualLivro(){
        return titulo;
    }

    public String qualAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano;
    }

}
