package models;

import java.util.List;

import enums.TamanhoAcai;
import models.acompanhamentos.Acompanhamento;

public class Acai {
  private double preco;
  private List<Acompanhamento> acompanhamentos;
  private TamanhoAcai tamanhoAcai;

  public Acai(List<Acompanhamento> acompanhamentos, TamanhoAcai tamanhoAcai) {
    this.acompanhamentos = acompanhamentos;
    this.tamanhoAcai = tamanhoAcai;
  }

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
