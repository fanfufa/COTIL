public class aluno {
    //atributos
    private int ra;
    private String nome;
    private double altura;
    private int idade;

    //Construtor
    public aluno(String nome, double altura, int idade, int ra){
        this.nome= nome;
        this.ra = ra;
        this.idade = idade;
        this.altura = altura;
    }

    public  String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa(){
        return ra;
    }

    public void setRa(int ra){
        if (ra>0)
            this.ra = ra;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    //metodos
    public void estudar()
    {
        System.out.println("Aluno estudando");
    }

    public void mostrarNome()
    {
        System.out.println("Nome:"+nome);
    }

    public void atribuirIdade()
    {
        idade = 18;
    }
}
