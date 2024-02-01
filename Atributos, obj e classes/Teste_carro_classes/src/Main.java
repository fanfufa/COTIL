public class Main {
    public static void main(String[] args) {
        classe carro1 = new classe();

        carro1.nome = "Camaro";
        carro1.ano = 2000;
        carro1.vel = 250; //em Km/h
        carro1.marca = "FORD";

        carro1.acelerar(10);

        System.out.println("Aceleracao = " + carro1.vel);
    }
}