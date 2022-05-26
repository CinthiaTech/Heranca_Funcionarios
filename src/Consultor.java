public class Consultor extends Funcionário {
    public String nome;
    protected static final long CPF = 0;
    protected double valordaHora;
    protected long horasTrabalhadas;
    public Consultor(String nome, long CPF, double valordaHora, long horasTrabalhadas) {
        super(nome, CPF);
        this.valordaHora = valordaHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

      public double calcularSalario() {
        return valordaHora + horasTrabalhadas;
    }

    public double getValordaHora() {
        return valordaHora;
    }

    public void setValordaHora(double valordaHora) {
        this.valordaHora = valordaHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}