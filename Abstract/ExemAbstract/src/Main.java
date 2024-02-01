public class Main {
    public static void main(String[] args) {
        Animal a = new Animal(); //Não deixa
        Cachorro c = new Cachorro();
        Animal a1 = new Cachorro();

        a1.emitirSom();
    }
}