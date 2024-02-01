
import java.util.Scanner;

public class Main{

    public static void main (String[] args)  {
        String nome;
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
    }
}