public class Circulo extends FormaBidimensional{
    protected  double raio;
    protected double a;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void obterArea() {
        a = 3.14*(raio*raio);
        System.out.println("Area do circulo: "+a);
    }
}