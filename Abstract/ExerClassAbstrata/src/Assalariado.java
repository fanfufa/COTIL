public class Assalariado extends Empregado{
    protected double salario;

    public Assalariado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario=salario;
    }

    @Override
    public double Vencimento() {
        System.out.println(salario);
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
