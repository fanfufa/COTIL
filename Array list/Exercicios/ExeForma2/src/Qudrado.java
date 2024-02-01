public class Qudrado extends FormaBidimensional {

    protected double a;
    protected double base;
    protected double altura;

    public Qudrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void obterArea() {
        a=base*altura;
        System.out.println("Area do quadrado: "+a);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
