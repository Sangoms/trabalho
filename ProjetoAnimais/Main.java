public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Miau", 2);

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }

    
}