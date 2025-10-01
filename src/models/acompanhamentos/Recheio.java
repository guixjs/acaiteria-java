package models.acompanhamentos;

import enums.TipoAcompanhamento;

public class Recheio extends Acompanhamento {

  public Recheio(String nome, double preco) {
    super(nome, preco, TipoAcompanhamento.RECHEIO);
  }

}
