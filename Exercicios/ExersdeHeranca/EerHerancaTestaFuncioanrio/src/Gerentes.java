public class Gerentes extends Funcionario {
    private String nomeUsuario;
    private int senha;

    public Gerentes(String nome, double salario, String nomeUsuario, int senha) {
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println(this.nomeUsuario);
        System.out.println(this.senha);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double Calulabonificacao(){
        double bonus = ((salario*0.20)+salario);
        return bonus;
    }
}
