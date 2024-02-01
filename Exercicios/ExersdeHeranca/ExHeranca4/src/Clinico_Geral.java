public class Clinico_Geral extends Medico {
    protected boolean atendeEmCasa;

    public Clinico_Geral(boolean trabalhanoHospital) {
        super(trabalhanoHospital);
    }

    public void receitar(){
        System.out.println("Receitar um medicamento para o paciente");
    }
}
