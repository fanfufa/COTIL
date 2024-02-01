public class Main {
    public static void main(String[] args) {
        try {
            Quadrado q1 = new Quadrado(12,0);
            q1.calcularArea();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            e.getMessage();
        }

        try {
            Retangulo r1 = new Retangulo(0, 1);
        }catch (IllegalArgumentException e){
            e.getMessage();
            e.printStackTrace();
        }

        System.out.println("Teste de tratamento");
    }
}