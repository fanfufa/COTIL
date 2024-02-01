public class Bolsista implements IAluno{

    @Override
    public double calcMedia(double n1, double n2) {
        return ((n1+n1)/2)+1;
    }

    @Override
    public void chorrar() {
        System.out.println("bolsista chorando");

    }
}
