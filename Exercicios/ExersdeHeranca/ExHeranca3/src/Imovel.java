public class Imovel {
    protected int codigo;
    protected String endereco;
    protected  double preco;

    public Imovel(int codigo, String endereco, double preco) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.preco = preco;
    }

    public void mostraDados(){
        System.out.println(this.codigo);
        System.out.println(this.endereco);
        System.out.println(this.preco);
    }
}
