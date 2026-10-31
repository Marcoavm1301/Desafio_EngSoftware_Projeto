public class Exemplar {
    private int codigo;
    private double[] dimensoes;
    private double peso;

    public Exemplar(int codigo, double[] dimensoes, double peso) {
        this.codigo = codigo;
        this.dimensoes = dimensoes;
        this.peso = peso;
    }

    // Get e Set para codigo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Get e Set para dimensoes
    public double[] getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(double[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    // Get e Set para peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
