public class Dinheiro implements TipoPagamento{
    protected double valor;

    public Dinheiro (double valor){
        this.valor = valor;
    }

    @Override
    public double getDiasFaturamento() {
        return 0;
    }

    @Override
    public double getFaturamentoPaga() {
        return 0;
    }
}
