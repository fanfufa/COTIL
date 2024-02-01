public class ContaEspecial extends ContaBancaria{
    float limite = -100;

    @Override
    public void mostra() {
        super.mostra();
        System.out.println(this.limite);
    }

    public ContaEspecial(String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
    }

    public double sacar(double saque){
        if (saldo-saque>limite)
            saldo-=saque;
        else
            System.out.println("Voce nao pode sacar");
        return saldo;
    }
}
