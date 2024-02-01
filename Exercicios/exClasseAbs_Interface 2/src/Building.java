public abstract class Building implements CarbonFootprint{
    protected int numeroPessoas;
    protected boolean energia;
    protected int numLampadas;

    public Building(int numeroPessoas, boolean energia, int numLampadas) {
        this.numeroPessoas = numeroPessoas;
        this.energia = energia;
        this.numLampadas = numLampadas;
    }
}
