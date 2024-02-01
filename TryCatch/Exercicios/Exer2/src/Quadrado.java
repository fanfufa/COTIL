public class Quadrado implements AreaCalculavel{
    protected double a;
    protected double base;
    protected double altura;

    @Override
    public void calcularArea() {
        if ((base==0)||(altura==0)){
            throw new IllegalArgumentException("Não é possível calcular a área com valores nulos");
        }
        else {
            a = base * altura;
            System.out.println("Area do quadrado: " + a);
        }
    }

    public Quadrado(double base, double altura) {
        if((base==0)||(altura==0)) {
            throw new IllegalArgumentException("Valores não podem ser nulos");
        }
        else {
            this.base = base;
            this.altura = altura;
        }
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

