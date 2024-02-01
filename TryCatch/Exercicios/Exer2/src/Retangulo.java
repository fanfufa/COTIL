public class Retangulo implements AreaCalculavel{
    protected double a;
    protected double base;
    protected double altura;

    @Override
    public void calcularArea() {
        if ((base==0)||(altura==0)||(base<0)||(altura<0)){
            throw new IllegalArgumentException("Valores esperados são maiores que zero 0");
        }
        else if ((base==altura)){
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
        }
        else {
            a = base * altura;
            System.out.println("Area do retangulo: " + a);
        }
    }

    public Retangulo(double base, double altura) {
        if ((base==0)||(altura==0)||(base<0)||(altura<0)){
            throw new IllegalArgumentException("Valores esperados são maiores que zero 0");
        }
        else if ((base==altura)){
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
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

