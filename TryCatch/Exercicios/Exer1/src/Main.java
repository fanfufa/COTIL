public class Main {
    public static void main(String[] args) {
        Object o = null;
        try {
            o.toString();
        }catch (NullPointerException e){
            System.out.println("A variavel não pode ser String");
        }

    }
}