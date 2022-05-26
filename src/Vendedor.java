public class Vendedor extends Funcionário {
    private double comissao;
    private long numeroVendas;


    public Vendedor(String nome, long CPF, double comissao, long numeroVendas) {
        super(nome, CPF);
            this.comissao = comissao;
            this.numeroVendas = numeroVendas;
        }

    public double calcularSalario(){
        return super.getSALARIO_MINIMO() + (this.comissao + this.numeroVendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(long numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}
