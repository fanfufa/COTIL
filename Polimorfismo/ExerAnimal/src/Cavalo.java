public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void som(){
        System.out.println("BRRRRRR");
    }

    public void correr(){
        System.out.println("Corredo mais rápido");
    }
}
