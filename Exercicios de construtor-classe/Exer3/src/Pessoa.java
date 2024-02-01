public class Pessoa {
    private int idade, dia, mes, ano;
    private String nome;

    public Pessoa (int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Pessoa(int dia, int mes, int ano, String nome){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        this.nome=nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia>0&&dia<32){
        this.dia = dia;}
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes>0&&mes<13)
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano>1000)
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculaIdade(){
        if (ano > 1000){
        idade= 2023-ano;}
        return idade;


    }
}
