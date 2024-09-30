package src.Inteiro;

public class IntSet {
    private boolean[] conjunto;

    public IntSet() {
        conjunto = new boolean[101]; // Conjunto para números de 0 a 100
    }

    // Insere um elemento no conjunto
    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    // remove um elemento do conjunto
    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    // Retorna a união de dois conjuntos
    public IntSet union(IntSet outroConjunto) {
        IntSet resultado = new IntSet();
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] || outroConjunto.conjunto[i]) {
                resultado.conjunto[i] = true;
            }
        }
        return resultado;
    }

    // Retorna a interseção de dois conjuntos
    public IntSet intersecao(IntSet outroConjunto) {
        IntSet resultado = new IntSet();
        for (int i = 0; i<= 100; i++) {
            if (this.conjunto[i] && outroConjunto.conjunto[i]) {
                resultado.conjunto[i] = true;
            }
        }
        return resultado;

    }

    // Retorna uma string com os elementos do conjunto
    public void toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i <= 100; i++) {

            if (conjunto[i]) {
                sb.append(i).append(" ");
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("-");

        } else {
            System.out.println("{ " + sb.toString().trim() + " }");
        }

    }
            // Verifica se dois conjuntos são iguais

    public boolean ehIgualTo(IntSet outroConjunto) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}