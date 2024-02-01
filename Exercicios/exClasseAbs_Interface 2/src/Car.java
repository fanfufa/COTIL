public class Car implements CarbonFootprint{
    protected String combustivel;
    protected float cilindrada;

    public Car(String combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootprint() {
        return 12;
    }
}
