public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String editora;

    public Livro(String titulo, String autor, String ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String toString() {
        String res = "Autor: " + autor + ", Titulo: " + titulo + ", Ano: " + ano + ", Editora: " + editora + ".";
        return res;
    }

}