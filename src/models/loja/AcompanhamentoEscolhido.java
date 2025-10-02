package models.loja;

import enums.QuantidadeAcompanhamento;
import models.acompanhamentos.Acompanhamento;

public class AcompanhamentoEscolhido {
  private Acompanhamento acompanhamento;
  private QuantidadeAcompanhamento quantidade;

  public AcompanhamentoEscolhido(Acompanhamento acompanhamento, QuantidadeAcompanhamento quantidade) {
    this.acompanhamento = acompanhamento;
    this.quantidade = quantidade;
  }

  public double calcularPreco() {
    return acompanhamento.getPreco() * quantidade.getPrecoPorQuantidade();
  }

  public Acompanhamento getAcompanhamento() {
    return acompanhamento;
  }

  public QuantidadeAcompanhamento getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return acompanhamento.getNome()
        + " - " + quantidade
        + " (R$ " + calcularPreco() + ")";
  }
}
