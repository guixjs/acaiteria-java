package models.loja;

import java.util.List;

import models.acompanhamentos.Fruta;
import models.acompanhamentos.Grao;
import models.acompanhamentos.Recheio;

public class Estoque {
  private List<Fruta> frutasEstoque;
  private List<Grao> graosEstoque;
  private List<Recheio> recheiosEstoque;

  public Estoque(List<Fruta> frutasEstoque, List<Grao> graosEstoque, List<Recheio> recheiosEstoque) {
    this.frutasEstoque = frutasEstoque;
    this.graosEstoque = graosEstoque;
    this.recheiosEstoque = recheiosEstoque;
  }

  public List<Fruta> getFrutasEstoque() {
    return frutasEstoque;
  }

  public List<Grao> getGraosEstoque() {
    return graosEstoque;
  }

  public List<Recheio> getRecheiosEstoque() {
    return recheiosEstoque;
  }

}
