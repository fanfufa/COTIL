public class Caneta extends Produto {
    private String cor;

    public void escreve()
    {
        System.out.println("Escrevendo");
    }


    @Override
    public void mostra() {
        super.mostra();
        System.out.println(cor);
    }

    public Caneta(int codigo, String descricao, String cor) {
        super(codigo, descricao);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
