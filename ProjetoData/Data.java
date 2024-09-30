package Data;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor (opcional, se quiser inicializar)
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }