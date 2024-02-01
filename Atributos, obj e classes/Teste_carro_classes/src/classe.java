public class classe {

    //atributos
    int ano, vel;
    String nome, marca;

    //metodos = açoes
    void acelerar(int aceleracao){
        vel += aceleracao;
    }

    void frear(int reduzir){
        vel -= reduzir;
    }

    void buzinar(){
        System.out.println("BIBIBI");
    }
}
