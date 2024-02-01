public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(12, 16, 2000);
        System.out.println("Idade: "+ p1.calculaIdade());
        System.out.println("dia: "+ p1.getDia());
        System.out.println("mes: "+ p1.getMes());
    }
}