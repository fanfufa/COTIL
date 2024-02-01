public class Antigo extends Imovel{
    protected double desconto;

    public Antigo(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }
}
