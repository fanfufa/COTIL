public class Main {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        f1.abrirPorta();
        f1.acelerar();
        f1.parar();
        System.out.println(f1.getPeco());

        System.out.println("");

        Agenda a1 = new Agenda();
        System.out.println(a1.getPeco());

        Carro c = new Ferrari();
        ItemLoja i = new Agenda();
        ItemLoja i2 = new Ferrari();
        Automovel au = new Ferrari();
    }
}