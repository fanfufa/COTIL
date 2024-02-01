public class Tetraedro extends FormaTridimensional{

    protected double a;
    protected double v;
    protected double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void obterVolume() {
        v=((aresta*aresta*aresta)*1.41)/12;
        System.out.println("O volume do tetraedro: "+v);
    }

    @Override
    public void obterArea() {
        a=(aresta*aresta)*1.73;
        System.out.println("A area do tetraedro: "+a);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
