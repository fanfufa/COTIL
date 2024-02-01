public class Bicicle implements CarbonFootprint{
    protected String marca;
    protected int tamanhoAro;

    public Bicicle(String marca, int tamanhoAro) {
        this.marca = marca;
        this.tamanhoAro = tamanhoAro;
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
}
