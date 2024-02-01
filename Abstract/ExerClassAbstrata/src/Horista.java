public class Horista extends Empregado{
    double precoHora;
    double horasTrabalhadas;
    double salario;


    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora=precoHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }

    @Override
    public double Vencimento() {
        salario =precoHora*horasTrabalhadas;
        System.out.println(salario);
        return precoHora*horasTrabalhadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


}
