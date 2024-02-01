public class Aluno extends Pessoa {
    private int ra;

    public void mostra() {
        super.mostra();
        System.out.println(this.ra);
    }

    @Override
    public void imprime(){
        System.out.println("É um aluno");
    }

    public double calcMedia(double n1,double n2){
        double media;
        media = (n1+n2)/2;
        return media;
    }

    public Aluno(String nome, int cpf, int ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
