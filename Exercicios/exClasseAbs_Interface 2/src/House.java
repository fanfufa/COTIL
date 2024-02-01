public class House extends Building{

    public House(int numeroPessoas, boolean energia, int numLampadas) {
        super(numeroPessoas, energia, numLampadas);
    }

    @Override
    public double getCarbonFootprint() {
        return 1;
    }
}
