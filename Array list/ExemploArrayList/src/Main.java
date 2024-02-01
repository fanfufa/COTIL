import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto(1, "Lápis");
        Livro l1 = new Livro(2, "Clássica", "SHREK");
        Caneta c1 = new Caneta(3, "bic", "azul");
        Livro l2 = new Livro(4, "Ficção", "Direito das Mulheres");

        ArrayList <Produto> lista = new ArrayList <Produto>();
        lista.add(prod1);
        lista.add(l1);
        lista.add(c1);
        lista.add(l2);

        for (Produto p: lista)
        {
            p.mostra();
            System.out.println("====================");

            if (p instanceof Livro){
                Livro l = (Livro)p;//VC força p a virar do tipo livro e armeza em l
                System.out.println("    oLÁ");
                l.ler();
            }

            if (p instanceof  Caneta){
                Caneta c = (Caneta)p;
                c.escreve();
            }
        }
    }
}