public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca("Luigi", 456, 700, 10);
        ContaEspecial ce1 = new ContaEspecial("Caio", 789, 400);
        ContaBancaria cb1 = new ContaBancaria("Joao", 123, 200);

        cb1.sacar(199);
        cp1.sacar(800);
        ce1.sacar(600);
        System.out.println("");

        cb1.mostra();
        System.out.println("");
        cp1.mostra();
        System.out.println("");
        ce1.mostra();

    }
}