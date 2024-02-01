public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        System.out.println(a1.calcMedia(10,6));

        System.out.println("");

        IAluno al = new Aluno();
        al.chorrar();

        System.out.println("");

        Bolsista b1 = new Bolsista();
        b1.chorrar();
        System.out.println(b1.calcMedia(10,6));
    }
}