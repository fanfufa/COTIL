public class Cubo extends FormaTridimensional{
    protected double lado;
    protected double a;
    protected double v;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public void obterArea() {
        a = 6*(lado*lado);
        System.out.println("Area do cubo: "+a);
    }

    @Override
    public void obterVolume() {
        v = (lado*lado*lado);
        System.out.println("Volume do cube: "+v);
    }
}
