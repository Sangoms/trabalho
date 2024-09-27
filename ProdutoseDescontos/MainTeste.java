public class MainTeste {
        public static void main(String[] args) {
            
            Eletronico notebook = new Eletronico("Notebook", 2200.0, 12);
            System.out.println(notebook);
            System.out.println("Preço com desconto: " + notebook.calcularPrecoComDesconto());
    
        
            Alimento feijão = new Alimento("Feijão", 20.0, "10/2024");
            System.out.println(feijão);
            System.out.println("Preço com desconto: " + feijão.calcularPrecoComDesconto());
        }
    }

