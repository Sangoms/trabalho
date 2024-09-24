public class Empregado {
    public String nome;
    public String sobrenome;
    public double salarioMensal;
    public double salarioAnual;

    Empregado(String nome, String sobrenome, double salarioMensal, double salarioAnual) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.salarioAnual = salarioAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public double calcSalarioAnual() {
        return salarioMensal * 12;
    }

    public void printSalarioAnual() {
        System.out.println("Salario Anual: " + calcSalarioAnual());
    }

    public double calcAdicional() {
        return calcSalarioAnual() * 0.1 + calcSalarioAnual();
    }

    public void printAdicionalSalario() {
        System.out.println(nome + ": Novo salario anual com aumento de 10% = " + calcAdicional());
    }
}
