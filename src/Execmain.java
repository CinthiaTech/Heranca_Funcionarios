public class Execmain extends Vendedor{
    public Execmain(String nome, long CPF, double comissao, long numeroVendas) {
        super(nome, CPF, comissao, numeroVendas);
    }

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Cinthia", 000044400000, 700, 30 );
        System.out.println("O valor do salário do vendedor é " + vendedor.calcularSalario());

        Consultor consultor = new Consultor("Cinthia", 000044400001 , 80, 2000);
                System.out.println("O valor do salário do consultor é " + consultor.calcularSalario());
    }
}
