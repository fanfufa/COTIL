public class Main {
    public static void main(String[] args) {
        Estoque e1= new Estoque("Impressora", 13, 6);
        Estoque e2= new Estoque("Monitor", 11, 13);
        Estoque e3= new Estoque("Mouse", 6, 2);



        System.out.println("Estoque 1: "+e1.mostra());


        System.out.println(e1.precisaRepor());
        System.out.println(e2.precisaRepor());
        System.out.println(e3.precisaRepor());

        e1.darBaixa(5);
        e2.repor(7);
        e3.darBaixa(4);

        System.out.println("Estoque 1: "+e1.mostra());
        System.out.println("Estoque 2: "+e2.mostra());
        System.out.println("Estoque 3: "+e3.mostra());

        System.out.println(e1.precisaRepor());
        System.out.println(e2.precisaRepor());
        System.out.println(e3.precisaRepor());
    }
}