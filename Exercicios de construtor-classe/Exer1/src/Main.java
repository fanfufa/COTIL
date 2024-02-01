public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Silva");
        Funcionario f2 = new Funcionario()
        func1.nome = "Luis";
        System.out.println("Sobrenome " + func1.getSobrenome());
        System.out.println("Salario " + func1.getSalario());
        System.out.println("Salário anual "+func1.salarioAnual());
        System.out.println("Salário anual com aumento de 10% "+func1.salarioAnualAumento());
    }
}