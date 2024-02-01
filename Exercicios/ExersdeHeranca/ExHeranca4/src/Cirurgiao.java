public class Cirurgiao extends Medico {

    public Cirurgiao(boolean trabalhanoHospital) {
        super(trabalhanoHospital);
    }

    public void fazerInscisao(){
        System.out.println("Ele precisa fazer uma incisao");
    }

    public void tratarPaciente(){
        System.out.println("Foi tratado");
    }
}
