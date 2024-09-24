public class Gerente extends Funcionario {
    private double bonus;

    // Construtor
    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    // Sobrescrevendo o método calcularSalario
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    // Método get e set para bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
