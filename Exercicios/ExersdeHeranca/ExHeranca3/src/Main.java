public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Imovel im1 = new Imovel(123, "Rua 1", 1234.45);
        Novo n1 = new Novo(456, "Rua 2", 1234.89);
        Usado u1 = new Usado(456, "Rua 3", 1234.89);

        im1.mostraDados();
        System.out.println("");
        n1.mostraDados();
        System.out.println("");
        u1.mostraDados();
        System.out.println("");
        System.out.println(n1.novoPreco(100));
        System.out.println(u1.novoPreco(100));

    }
}