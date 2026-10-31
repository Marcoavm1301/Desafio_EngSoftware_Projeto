
public class Main {

    public static void main(String[] args) {
        double[] dimensao = { 23.0, 16.0, 10 };
        Exemplar exemplar = new Exemplar(1, dimensao, 0.5);
        Endereco endereco = new Endereco(55, "Rua teste", "São Paulo");
        Emprestimo emprestimo1 = new Emprestimo(null, null, null, 0);

        emprestimo1.setFrete(new StrategyFreteA());
        System.out.println("Calculo de Frete para empresa A: " + emprestimo1.calcularFrete(endereco, exemplar));
        emprestimo1.setFrete(new StrategyFreteB());
        System.out.println("Calculo de Frete para empresa B: " + emprestimo1.calcularFrete(endereco, exemplar));
        emprestimo1.setFrete(new StrategyFreteC());
        System.out.println("Calculo de Frete para empresa C: " + emprestimo1.calcularFrete(endereco, exemplar));
        emprestimo1.setFrete(new StrategyFreteD());
        System.out.println("Calculo de Frete para empresa D: " + emprestimo1.calcularFrete(endereco, exemplar));
    }

}
