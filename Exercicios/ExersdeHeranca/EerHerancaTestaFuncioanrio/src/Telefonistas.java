public class Telefonistas extends Funcionario{
    private int codigo;

    public Telefonistas(String nome, double salario, int codigo) {
        super(nome, salario);
        this.codigo = codigo;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println(this.codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
