public class Main {
    public static void main(String[] args) {
        item i1 = new item(1234, 10, -5.90, "bonito" );
        System.out.println("Quantidade: "+i1.getQuant());
        System.out.println("Preco: "+i1.getPreco());
        System.out.println("Total: "+i1.getTotal());
    }
}