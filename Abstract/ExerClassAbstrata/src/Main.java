import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Assalariado a1 = new Assalariado("Gabriel", "Pinto", "1919191919", 2);
        Assalariado a2 = new Assalariado("Roberto", "Dick", "91919191919", 1);
        Comissionado c1 = new Comissionado("Cleber" , "Machado", "45436", 10, 5 );
        Comissionado c2 = new Comissionado("Cleber" , "Marcos", "45345345336", 10, 6 );
        Horista h1 = new Horista("Luis", "Oliveira", "123234", 56, 2);
        Horista h2 = new Horista("Tania", "Luisa", "123435", 54, 10);



        ArrayList <Empregado> lista = new ArrayList <Empregado>();
        lista.add(a1);
        lista.add(a2);
        lista.add(c1);
        lista.add(c2);
        lista.add(h1);
        lista.add(h2);

        for(Empregado i : lista){
            if(i instanceof Assalariado) {
                Assalariado a = (Assalariado) i;
                a.Vencimento();
            }

            if (i instanceof Comissionado){
                Comissionado c = (Comissionado) i;
                c.Vencimento();
            }

            if (i instanceof Horista) {
                Horista h = (Horista) i;
                h.Vencimento();
            }
        }
    }
}