public class Estoque {
    String nome;
    int qtdAtual, qtdMinima;

    Estoque (String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void mostra(){
        System.out.println(this.nome + " " + this.qtdAtual + " " + this.qtdMinima);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if (qtdAtual>0)
            this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if (qtdMinima>0)
            this.qtdMinima = qtdMinima;
    }

    public int repor(int qtd){
        qtdAtual += qtd;
        return qtdAtual;
    }

    public int darBaixa(int qtd){
        qtdAtual -= qtd;
        return qtdAtual;
    }

    public boolean precisaRepor(){
        if (qtdAtual<=qtdMinima){
            return true;
        }
        else {
            return false;
        }
    }
}
