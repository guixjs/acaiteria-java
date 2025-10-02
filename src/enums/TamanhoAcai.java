package enums;

public enum TamanhoAcai {
  PEQUENO(6),
  MEDIO(8),
  GRANDE(10);

  private final double precoPorTamanho;

  private TamanhoAcai(double precoPorTamanho) {
    this.precoPorTamanho = precoPorTamanho;
  }

  public double getPrecoPorTamanho() {
    return precoPorTamanho;
  }
}
