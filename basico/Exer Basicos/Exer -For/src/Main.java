import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, preco, lucro, venda;
        Scanner ler = new Scanner(System.in);
        for(i=0;i<3;i++) {
            System.out.println("Digite o preço do produto: ");
            preco = ler.nextInt();
            if (preco < 100) {
                venda = preco + 20;
                System.out.println("Venda: "+venda);
            }
            else {
                venda = preco + 50;
                System.out.println("Venda: " + venda);
            }
        }
    }
}