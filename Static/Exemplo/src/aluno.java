public class aluno {
    private int ra;
    private String nome;
    private double mediaAluno;
    private static double mediaTotal=0;

    public aluno(int ra, String nome, double mediaAluno) {
        this.ra = ra;
        this.nome = nome;
        this.mediaAluno = mediaAluno;
        mediaTotal = mediaTotal + mediaAluno;
    }

    public static double getMediaTotal() {
        return mediaTotal;
    }

    public static void setMediaTotal(double mediaTotal) {
        aluno.mediaTotal = mediaTotal;
    }

    public double getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
