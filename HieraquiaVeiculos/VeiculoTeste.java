package HieraquiaVeiculos;

    public class VeiculoTeste {
        public static void main(String[] args) {
           Carro carro = new Carro("BMW", "X1", 2020, 4);
            System.out.println("Detalhes do Carro:");
            carro.exibirDetalhes();
    
            System.out.println();

            Moto moto = new Moto("Honda", "CB500", 2021, "Estilo Café Racer");
            System.out.println("Detalhes da Moto:");
            moto.exibirDetalhes();
        }
    }