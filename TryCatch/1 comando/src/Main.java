public class Main {
    public static void main(String[] args) {
        String nome = "abc";
        try {
            System.out.println(nome.toUpperCase().charAt(7));
        }catch (NullPointerException e){
            System.out.println("String não pode ser nula");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Indice fora do limite");
        }catch(Exception e){
            System.out.println("Erro");
        }

        Aluno al = new Aluno();
        try{
            al.setRa(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Aluno al2 = new Aluno();
        try{
            al2.setNome("");
            System.out.println(al2.getNome());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Acabou a paz");
    }
}