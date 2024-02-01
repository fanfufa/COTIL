public class Comissionado extends Empregado{
    double totalVenda;
    double taxaComissao;
    double salario;

    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(nome, sobrenome, cpf);
        this.totalVenda=totalVenda;
        this.taxaComissao=taxaComissao;
    }

    @Override
    public double Vencimento() {
        salario=totalVenda+taxaComissao;
        System.out.println(salario);
        return salario=totalVenda+taxaComissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }


}
