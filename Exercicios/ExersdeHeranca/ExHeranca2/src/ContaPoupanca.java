public class ContaPoupanca extends ContaBancaria{
    protected int diaRendimento;

    @Override
    public void mostra() {
        super.mostra();
        System.out.println(this.diaRendimento);
    }

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(int rendimento){
        double novosaldo = saldo + rendimento;
    }
}
