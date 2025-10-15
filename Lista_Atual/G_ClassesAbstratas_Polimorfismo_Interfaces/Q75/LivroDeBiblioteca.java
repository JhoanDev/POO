public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String local;
    private String descr;

    LivroDeBiblioteca(String titulo, String autor, int ano, int paginas, String local, String descr) {
        super(titulo, autor, paginas, ano);
        this.emprestado = false;
        this.descr = descr;
        this.local = local;
    }

    @Override
    public boolean estaEmprestado() {
        return this.emprestado;
    }

    @Override
    public void empresta() {
        this.emprestado = true;
    }

    @Override
    public void devolve() {
        this.emprestado = false;
    }

    @Override
    public String localizacao() {
        return this.local;
    }

    @Override
    public String descricao() {
        return this.descr;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocal: " + local + "\tDescricao: " + descr
                + (emprestado ? "\t(Emprestado)" : "\t(Livre)");
    }
}
