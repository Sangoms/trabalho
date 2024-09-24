package ProjetoFuncionario;

public class Funcionario {
   private String nome;
   private double salarioBase;  

     Funcionario(String nome,double salarioBase){
        this.nome = nome;
        this.salariobase = salarioBase;

     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double calcSalario(){
        return salarioBase;
        
    }
}
