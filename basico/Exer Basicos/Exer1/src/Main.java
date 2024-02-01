import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        double salario, num_vendas, total;

        System.out.println("Qual seu nome ? ");
        Scanner ler = new Scanner(System.in);
        nome = ler.nextLine();
        System.out.println("Qual seu salario? ");
        salario = ler.nextDouble();
        System.out.println("Qual seu total de vendas? ");
        num_vendas = ler.nextDouble();
        total = (num_vendas * 15.0/100.0) + salario;
        System.out.println("O total de vendas é "+ total);
    }
}