import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, cont_kids=0, total_idade=0;
        double media;
        do {
            System.out.println("Digite a idade da criança:");
            idade = ler.nextInt();
            if (idade < 0) {
                break;
            }
            else {
                cont_kids++;
                total_idade += idade;
            }

        }
        while (idade>0);

        media = (double) (total_idade / (cont_kids));

        System.out.println("A media de idade é "+ media);
    }
}