public class Novo extends Imovel{
    protected double adicional;

    public Novo(int codigo, String endereco, double preco) {
        super(codigo, endereco, preco);
        this.adicional = adicional + preco;
    }

    public double getAdicional() {
        return adicional;
    }

    public void mostra(){
        super.mostraDados();
        System.out.println(this.adicional);
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double novoPreco(double adicional) {
         double novopreco = preco + adicional;
         return novopreco;
    }

}
