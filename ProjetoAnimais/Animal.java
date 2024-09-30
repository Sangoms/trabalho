public abstract class Animal {

    private String nome;
    private int idade;

    // Construtor

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método get e set

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    } 

    public int getIdade(){
        return idade;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }
    // Método abstratc 

    public abstract String emitirSom();
    

}