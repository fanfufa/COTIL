public class Ferrari implements Carro, ItemLoja{
    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerado");

    }

    @Override
    public void parar() {
        System.out.println("Ferrari parando");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Ferrari abrindo porta");
    }

    @Override
    public double getPeco() {
        return 999999999;
    }
}
