public class Main {
    public static void main(String[] args) {
       aluno al1 = new aluno("Joao", 1.60, 18, 98374); // al1 é um objeto, assim como al2, d1, d2 e b1
       //al1.setNome("Joao");
        //al1.altura = 1.85;
      //  al1.setAltura(1.85);
      //  al1.setIdade(19);
      //  al1.setRa(121234);
        al1.mostrarNome();
        al1.estudar();
        //System.out.printf("\nAltura: " + al1.getAltura()+"\n");
     System.out.println("Altura: "+al1.getAltura());

        aluno al2 = new aluno("Adriano", 1.80, 18, 123234);
       // al2.setNome("Adriano");
       // al2.setAltura(1.80);
       // al2.setIdade(16);
       // al2.setRa(323345);
        al2.atribuirIdade();
        al2.estudar();
        System.out.println("Nova idade do " + al2.getNome() + ":" + al2.getIdade());

        Abacaxi b1 = new Abacaxi();
        b1.sabor = "doce";
        b1.mostraSabor();
        b1.peso = 5.200;
        b1.mostrarPeso();

        Disciplina d1 = new Disciplina();
        d1.setNome("Joao");
        d1.setCargaHoraria(10);

        System.out.println("Nome: " + d1.getNome() + "\nCarga: " + d1.getCargaHoraria() );
    }
}

