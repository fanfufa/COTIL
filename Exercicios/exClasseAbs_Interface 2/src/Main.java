import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("aDRIANO", 200);
        Car c2 = new Car("Craio", 150);
        Bicicle b1 = new Bicicle("Nike", 20);
        Bicicle b2 = new Bicicle("Ardidas", 15);
        House h1 = new House(123, true, 4);
        School s1 = new School(456, false, 8);

        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
        lista.add(c1);
        lista.add(c2);
        lista.add(b1);
        lista.add(b2);
        lista.add(h1);
        lista.add(s1);

        for (CarbonFootprint c: lista){
            System.out.println(c.getCarbonFootprint());
        }

    }
}