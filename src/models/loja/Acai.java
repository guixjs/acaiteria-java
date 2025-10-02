package models.loja;

import java.util.List;

import enums.TamanhoAcai;
import enums.TipoAcompanhamento;
import exceptions.QuantidadeMaximaException;

public class Acai {
  private double preco;
  private List<AcompanhamentoEscolhido> acompanhamentos;
  private TamanhoAcai tamanhoAcai;

  public Acai(List<AcompanhamentoEscolhido> acompanhamentos, TamanhoAcai tamanhoAcai) {
    this.acompanhamentos = acompanhamentos;
    this.tamanhoAcai = tamanhoAcai;
  }

  public double getPreco() {
    return preco;
  }

  public List<AcompanhamentoEscolhido> getAcompanhamentos() {
    return acompanhamentos;
  }

  public TamanhoAcai getTamanhoAcai() {
    return tamanhoAcai;
  }

  public void adicionarAcompanhamento(AcompanhamentoEscolhido item) throws QuantidadeMaximaException {
    long qtdFrutas = acompanhamentos.stream()
        .filter(i -> i.getAcompanhamento().getTipo() == TipoAcompanhamento.FRUTA)
        .count();

    long qtdRecheios = acompanhamentos.stream()
        .filter(i -> i.getAcompanhamento().getTipo() == TipoAcompanhamento.RECHEIO)
        .count();

    long qtdGraos = acompanhamentos.stream()
        .filter(i -> i.getAcompanhamento().getTipo() == TipoAcompanhamento.GRAO)
        .count();

    switch (item.getAcompanhamento().getTipo()) {
      case FRUTA:
        if (qtdFrutas >= 4) {
          throw new QuantidadeMaximaException(item);
        }
        break;
      case RECHEIO:
        if (qtdRecheios >= 2) {
          throw new QuantidadeMaximaException(item);
        }
        break;
      case GRAO:
        if (qtdGraos >= 3) {
          throw new QuantidadeMaximaException(item);
        }
        break;
    }

    acompanhamentos.add(item);
  }

  public double calcularPreco() {
    double total = tamanhoAcai.getPrecoPorTamanho();

    for (AcompanhamentoEscolhido item : acompanhamentos) {
      total += item.calcularPreco();
    }

    return total;
  }

  @Override
  public String toString() {
    return "Açaí tamanho " + tamanhoAcai
        + "\nAcompanhamentos: " + acompanhamentos
        + "\nPreço final: R$ " + calcularPreco();
  }

}
