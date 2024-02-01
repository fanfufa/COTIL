public class Retangulo {
    private int base;
    private int altura;

    public Retangulo (){
        base = 1;
        altura = 1;
    }

    //construtor
    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
       if (base>0&&base<21)
           this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura>0&&altura<21)
            this.altura = altura;
    }

    public  int calcPerimetro(){
        int perimetro = (base * 2) + (altura*2);
        return perimetro;
    }

    public int calcArea(){
        int area = base*altura;
        return area;
    }

}
