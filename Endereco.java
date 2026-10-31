public class Endereco {
  private int numero;
  private String rua;
  private String cidade;

  public Endereco(int numero, String rua, String cidade) {
    this.numero = numero;
    this.rua = rua;
    this.cidade = cidade;
  }

  // Get e Set para numero
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  // Get e Set para rua
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  // Get e Set para cidade
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

}
