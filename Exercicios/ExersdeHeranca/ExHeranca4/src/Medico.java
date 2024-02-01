public class Medico {
    protected boolean trabalhanoHospital;

    public Medico(boolean trabalhanoHospital) {
        this.trabalhanoHospital = trabalhanoHospital;
    }

    public void tratarPaciente(){
        System.out.println("Paciente precisa ser tratado");
    }
}
