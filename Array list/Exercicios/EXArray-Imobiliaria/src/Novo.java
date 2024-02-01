public class Novo extends Imovel{
    protected double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = preco+adicional;
    }

    public void mostra(){
        super.mostra();
        System.out.println(adicional);
    }
}
