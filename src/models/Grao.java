package models;

import enums.TipoAcompanhamento;

public class Grao extends Acompanhamento {

  public Grao(String nome, double preco) {
    super(nome, preco, TipoAcompanhamento.GRAO);
  }

}
