package exceptions;

import models.loja.AcompanhamentoEscolhido;

public class QuantidadeMaximaException extends Exception {
  public QuantidadeMaximaException(AcompanhamentoEscolhido item) {
    super("Você já adicionou " + item.getAcompanhamento().getNome() + " suficienete");
  }

}
