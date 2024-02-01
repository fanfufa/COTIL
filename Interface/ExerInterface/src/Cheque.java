public class Cheque implements TipoPagamento{
    protected double valor;

    public Cheque (double valor){
        this.valor = valor;
    }

    @Override
    public double getDiasFaturamento() {
        return 3;
    }

    @Override
    public double getFaturamentoPaga() {
        return 3;
    }
}
