public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico(true);
        Medico m2 = new Cirurgiao(false);
        // Não deu certo Cirurgiao c1 = (Cirurgiao) new Medico(true);
        Clinico_Geral cg1 = new Clinico_Geral( true);
        Cirurgiao c1 = new Cirurgiao(true);

        cg1.receitar();
        m1.tratarPaciente();
        m2.tratarPaciente();
        c1.fazerInscisao();

    }
}