public class Produtos {
    private String nome;
    private double preco;
    private double desconto; 
    
    
    public Produtos(String nome, double preco) {
        this.nome = nome; 
        this.preco = preco;
        this.desconto = 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularPrecoComDesconto() {
        return preco - (preco * desconto / 100);
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }
}
