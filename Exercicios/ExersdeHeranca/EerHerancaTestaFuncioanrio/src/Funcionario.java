public class Funcionario {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double Calulabonificacao(){
        double bonus = ((salario*0.10)+salario);
        return bonus;
    }

    public void mostraDados(){
        System.out.println(this.nome);
        System.out.println(this.salario);
    }
}