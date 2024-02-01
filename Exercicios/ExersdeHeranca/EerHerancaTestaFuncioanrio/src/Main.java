public class Main {
    public static void main(String[] args) {
        Gerentes g1 = new Gerentes("Adriano", 4000, "adriano", 1234);
        Telefonistas t1 = new Telefonistas("Claudia", 1000, 56789);
        Secretarias s1 = new Secretarias("Antonia", 1500, 72143);


        System.out.println("Salarios bonus");
        System.out.println("");
        System.out.println(g1.Calulabonificacao());
        System.out.println("");

        System.out.println(t1.Calulabonificacao());
        System.out.println("");

        System.out.println(s1.Calulabonificacao());
        System.out.println("");

        System.out.println("Dados");
        g1.mostraDados();
        System.out.println("");
        t1.mostraDados();
        System.out.println("");
        s1.mostraDados();
    }
}