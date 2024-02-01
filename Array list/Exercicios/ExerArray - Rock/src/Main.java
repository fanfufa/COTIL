import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(100);
        Comum c1 = new Comum(150);
        Vip v1 = new Vip(10, 5);
        double total = 0;

        ArrayList <Ingresso> lista = new ArrayList<Ingresso>();
        lista.add(i1);
        lista.add(c1);
        lista.add(v1);

        for (Ingresso i: lista){
            i1.imprimeValor();

            if (i instanceof Vip){
                Vip v = (Vip) i;
                total += v.valor + v.adicional;
            }

            if (i instanceof Comum){
                Comum c = (Comum) i;
                total += c.valor;
            }
        }
        System.out.println("Valor: "+total);
    }
}