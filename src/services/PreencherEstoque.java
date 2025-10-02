package services;

import java.util.List;

import models.acompanhamentos.Fruta;
import models.acompanhamentos.Grao;
import models.acompanhamentos.Recheio;
import models.loja.Estoque;

public class PreencherEstoque {

  public static Estoque execute() {
    List<Fruta> frutasDisponiveis = List.of(
        new Fruta("Banana", 2.0),
        new Fruta("Kiwi", 1.30),
        new Fruta("Morango", 3.50),
        new Fruta("Manga", 2.80),
        new Fruta("Blueberry", 4.20),
        new Fruta("Framboesa", 4.50));

    List<Grao> graosDisponiveis = List.of(
        new Grao("Amendoim", 2.0),
        new Grao("Paçoca", 1.30),
        new Grao("Granola", 2.50),
        new Grao("Aveia", 1.20),
        new Grao("Uva-passa", 1.80));

    List<Recheio> recheiosDisponiveis = List.of(
        new Recheio("Nutela", 2.0),
        new Recheio("Leite condensado", 1.30),
        new Recheio("Calda de chocolate", 1.80),
        new Recheio("Calda de morango", 1.80),
        new Recheio("Doce de leite", 1.60),
        new Recheio("Mel", 2.10));

    Estoque estoquePreenchido = new Estoque(frutasDisponiveis, graosDisponiveis, recheiosDisponiveis);
    return estoquePreenchido;
  }

}
