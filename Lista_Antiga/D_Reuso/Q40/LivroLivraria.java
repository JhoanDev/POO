public class LivroLivraria extends Livro {
    private float preco;

    public LivroLivraria(String titulo, String autor, String ano, String editora, float preco) {
        super(titulo, autor, ano, editora);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void aumentarPreco(float valor) {
        preco += valor;
    }

    public void diminuirPreco(float valor) {
        if (preco - valor >= 0) {
            preco -= valor;
        } else {
            System.out.println("Nao e possível diminuir o preço abaixo de zero.");
        }
    }

    public void aplicarDesconto(float percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) {
            float desconto = (percentualDesconto / 100) * preco;
            preco -= desconto;
        } else {
            System.out.println("O percentual de desconto deve estar entre 0 e 100.");
        }
    }

    public String toString() {
        return "Livro -> Preço: R$ " + String.format("%.2f", preco) + ", " + super.toString();
    }
    
}
