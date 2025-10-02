package enums;

public enum QuantidadeAcompanhamento {
  POUCO(0.8),
  IDEAL(1.0),
  MUITO(1.2);

  private final double precoPorQuantidade;

  private QuantidadeAcompanhamento(double precoPorQuantidade) {
    this.precoPorQuantidade = precoPorQuantidade;
  }

  public double getPrecoPorQuantidade() {
    return precoPorQuantidade;
  }

}
