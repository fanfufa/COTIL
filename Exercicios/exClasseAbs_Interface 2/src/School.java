public class School extends Building{

    public School(int numeroPessoas, boolean energia, int numLampadas) {
        super(numeroPessoas, energia, numLampadas);
    }

    @Override
    public double getCarbonFootprint() {
        return 30;
    }
}
