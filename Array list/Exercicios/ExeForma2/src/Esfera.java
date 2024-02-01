public class Esfera extends FormaTridimensional{

    protected double a;
    protected double v;
    protected double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public void obterVolume() {
        v=((4/3)*3.14*(raio*raio*raio));
        System.out.println("Volume da esfera: "+v);
    }

    @Override
    public void obterArea() {
        a=4*3.14*(raio*raio);
        System.out.println("Area da esfera: "+a);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
