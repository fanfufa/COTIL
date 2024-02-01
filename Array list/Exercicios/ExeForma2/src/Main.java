public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(12);
        Qudrado q1 = new Qudrado(10, 10);
        Triangulo t1 = new Triangulo(10, 30);

        Cubo c2 = new Cubo(50);
        Tetraedro t2 = new Tetraedro(20);
        Esfera e1 = new Esfera(50);

        c1.obterArea();
        q1.obterArea();
        t1.obterArea();

        c2.obterArea();
        c2.obterVolume();
        t2.obterArea();
        t2.obterVolume();
        e1.obterArea();
        e1.obterVolume();
    }
}