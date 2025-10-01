package models.acompanhamentos;

import enums.TipoAcompanhamento;

public abstract class Acompanhamento {
  private String nome;
  private double preco;
  private TipoAcompanhamento tipo;

  public Acompanhamento(String nome, double preco, TipoAcompanhamento tipo) {
    this.nome = nome;
    this.preco = preco;
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public TipoAcompanhamento getTipo() {
    return tipo;
  }

  public String detalhesAcompanhamento() {
    String mensagem = "Tipo do acompanhamento: %s\nNome: %s\nPreço: R$%.2f".formatted(this.tipo, this.nome, this.preco);

    return mensagem;
  }

}
