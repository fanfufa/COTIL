public class Funcionario {
    private String nome;
    private String sobrenome;
    private int salario;

    public Funcionario(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {

        if (salario > 0){
        this.salario = salario;
        }
        else {
            this.salario = 0;
        }
    }

    public int salarioAnual(){
        int salarioAnual = this.salario*13;
        return salarioAnual;
    }

    public double salarioAnualAumento (){
        double aumentoSalario = (this.salario+(this.salario*0.1))*13;
        return aumentoSalario;
    }
}
