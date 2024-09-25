import ProjetoFuncionario.Gerente;
import ProjetoFuncionario.Assistente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("San", 7000, 4000);
        Assistente assistente = new Assistente("Susu", 6000);

        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Assistente: " + assistente.calcularSalario());
    }
}
