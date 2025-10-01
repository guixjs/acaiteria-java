package models;

import java.util.List;

import enums.TamanhoAcai;

public class Acai {
  private double preco;
  private List<Acompanhamento> acompanhamentos;
  private TamanhoAcai tamanhoAcai;

  public double getPreco() {
    return preco;
  }

  public List<Acompanhamento> getAcompanhamentos() {
    return acompanhamentos;
  }

  public TamanhoAcai getTamanhoAcai() {
    return tamanhoAcai;
  }

}
