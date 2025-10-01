package models.acompanhamentos;

import enums.TipoAcompanhamento;

public class Fruta extends Acompanhamento {

  public Fruta(String nome, double preco) {
    super(nome, preco, TipoAcompanhamento.FRUTA);
  }



}
