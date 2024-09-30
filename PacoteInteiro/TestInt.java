package PacoteInteiro;

public class TestInt {
    public static void main(String[] args) {
        IntSet conjA = new IntSet();
        IntSet conjB = new IntSet();

        // Inserindo elementos no conjA
        conjA.insereElemento(1);
        conjA.insereElemento(2);
        conjA.insereElemento(3);

        // Inserindo elemento no conjunto B
        conjB.insereElemento(3);
        conjB.insereElemento(5);
        conjB.insereElemento(6);

        // Exibindo conjuntos
        System.out.print("Conjunto A");
        conjA.toSetString();
        System.out.print("Conjunto B");
        conjB.toSetString();

        // União dos conjuntos
        IntSet uniao = conjA.union(conjB);
        System.out.print("União:");
         uniao.toSetString();

        // Interseção dos conjuntos
        IntSet intersecao = conjA.intersecao(conjB);
        System.out.print("Interserção:");
        intersecao.toSetString();

        // Comparando os conjuntos
        System.out.println("Conjuntos A e B são iguais?" + conjA.ehIgualTo(conjB));
    }
}