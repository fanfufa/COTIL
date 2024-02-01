public class item {
    private int cod, quant;
    private double preco;
    private String descricao;

    public item(int cod, int quant, double preco, String descricao){
        this.cod = cod;
        if (quant < 0) {
            this.quant = 0;
        }
        else{
            this.quant = quant;
        }

        if (preco <0) {
            this.preco = 0;
        }
        else {
            this.preco = preco;
        }

        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        if (quant < 0) {
            this.quant = 0;
        }
        else{
            this.quant = quant;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <0) {
            this.preco = 0;
        }
        else{
                this.preco = preco;
            }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTotal(){
        double total = (preco * quant);
        return total;
    }
}
