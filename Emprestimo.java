public class Emprestimo {
    private Data dataRetirada;
    private Data dataEntregaPrevista;
    private Data dataEntregaRealizada;
    private int tipoFrete;
    private StrategyFrete strategyFrete;

    public Emprestimo(Data dataRetirada, Data dataEntregaPrevista, Data dataEntregaRealizada, int tipoFrete) {
        this.dataRetirada = dataRetirada;
        this.dataEntregaPrevista = dataEntregaPrevista;
        this.dataEntregaRealizada = dataEntregaRealizada;
        this.tipoFrete = tipoFrete;
    }

    public void setFrete(StrategyFrete strategyFrete) {
        this.strategyFrete = strategyFrete;
    }

    // get e set da dataRetirada
    public Data getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Data dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    // Get e Set para dataEntregaPrevista
    public Data getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Data dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    // Get e Set para dataEntregaRealizada
    public Data getDataEntregaRealizada() {
        return dataEntregaRealizada;
    }

    public void setDataEntregaRealizada(Data dataEntregaRealizada) {
        this.dataEntregaRealizada = dataEntregaRealizada;
    }

    // Get e Set para tipoFrete
    public int getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(int tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public double calcularFrete(Endereco endereco, Exemplar exemplar) {
        return strategyFrete.calcularFrete(endereco, exemplar);
    }

}