public class CartaoCredito implements TipoPagamento {
    protected double valor;

    public CartaoCredito( double valor){
        this.valor =  valor;
    }
    @Override
    public double getDiasFaturamento() {
        return 20;
    }

    @Override
    public double getFaturamentoPaga() {
        return 10;
    }
}
