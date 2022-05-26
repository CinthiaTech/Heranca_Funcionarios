public class Funcionário {
    public Funcionário(String nome, long cpf) {

    }
    protected double getSALARIO_MINIMO() {
        return 1000;
    }

    public abstract class Funcionario{
        protected String nome;
        protected long cpf;
        protected final double SALARIO_MINIMO = 1000.00;

        public Funcionario(String nome, long CPF){
            this.nome = nome;
            this.cpf = CPF;
            }
        public abstract double calcularSalario();

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public long getCpf() {
            return cpf;
        }

        public void setCpf(long cpf) {
            this.cpf = cpf;
        }

        public double getSALARIO_MINIMO() {
            return SALARIO_MINIMO;
        }
    }

}
