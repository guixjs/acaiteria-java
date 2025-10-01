package services;

import java.util.List;

import models.Estoque;
import models.acompanhamentos.Fruta;
import models.acompanhamentos.Grao;
import models.acompanhamentos.Recheio;

public class PreencherEstoque {

  public static Estoque execute() {
    List<Fruta> frutasDisponiveis = List.of(
        new Fruta("Banana", 2.0),
        new Fruta("Kiwi", 1.30));

    List<Grao> graosDisponiveis = List.of(
        new Grao("Amendoim", 2.0),
        new Grao("Paçoca", 1.30));

    List<Recheio> recheiosDisponiveis = List.of(
        new Recheio("Nutela", 2.0),
        new Recheio("Leite condensado", 1.30));

    Estoque estoquePreenchido = new Estoque(frutasDisponiveis, graosDisponiveis, recheiosDisponiveis);
    return estoquePreenchido;
  }

}
