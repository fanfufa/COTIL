import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Imovel i1 = new Imovel("Rua", 2);
        Novo n1 = new Novo("Bairro", 25, 20);
        Antigo a1 = new Antigo("Doutro", 70, 60);

        ArrayList <Imovel> lista = new ArrayList<Imovel>();
        lista.add(i1);
        lista.add(n1);
        lista.add(a1);

        for (Imovel i: lista){
            if (i instanceof Novo){
                Novo n = (Novo) i;
                n.mostra();
            }
        }

    }
}