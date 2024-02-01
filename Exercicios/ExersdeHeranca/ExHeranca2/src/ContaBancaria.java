public class ContaBancaria {
        protected String cliente;
        protected int numConta;
        protected double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void mostra(){
        System.out.println(this.cliente);
        System.out.println(this.numConta);
        System.out.println(this.saldo);
    }

    public double sacar(double saque){
            if (saldo-saque>0){
                saldo-=saque;
                System.out.println(saldo);}
            else
                System.out.println("Voce nao pode sacar");
            return saldo;
        }

        public double depositar(double deposito){
            return saldo+deposito;
        }
}
