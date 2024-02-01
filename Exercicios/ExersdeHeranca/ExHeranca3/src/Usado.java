public class Usado extends Imovel{
    protected double desconto;

    public Usado(int codigo, String endereco, double preco) {
        super(codigo, endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void mostra(){
        super.mostraDados();
        System.out.println(this.desconto);
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double novoPreco(double desconto) {
        double novopreco = preco - desconto;
        return novopreco;
    }
}
