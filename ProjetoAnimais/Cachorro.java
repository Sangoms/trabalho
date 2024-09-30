public class Cachorro extends Animal{

    // Construtor

    public Cachorro(String nome, int idade){
        super(nome, idade);

    }

    @Override

    public String emitirSom(){
        return "O cachorro late";
    }
}