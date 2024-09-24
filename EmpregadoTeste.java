public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando instâncias de Empregado
        Empregado empregado1 = new Empregado("julia", "silva", 4400, 1.000);
        Empregado empregado2 = new Empregado("san", "gomes", 3000, 1.000);

        // Calculando e imprimindo salários
        empregado1.printSalarioAnual();
        empregado1.printAdicionalSalario();

        empregado2.printSalarioAnual();
        empregado2.printAdicionalSalario();
    }
}
