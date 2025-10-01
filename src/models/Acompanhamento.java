package models;

import enums.TipoAcompanhamento;

public class Acompanhamento {
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

}
