import java.util.List;

import enums.QuantidadeAcompanhamento;
import enums.TamanhoAcai;
import models.acompanhamentos.Acompanhamento;
import models.acompanhamentos.Fruta;
import models.loja.Acai;
import models.loja.AcompanhamentoEscolhido;
import models.loja.Estoque;
import services.PreencherEstoque;

public class Main {
  public static void main(String[] args) {

    Estoque estoque = PreencherEstoque.execute();

    Acompanhamento banana = new Fruta(estoque.getFrutasEstoque().getFirst().getNome(),
        estoque.getFrutasEstoque().getFirst().getPreco());
    List<AcompanhamentoEscolhido> acompanhamentos = List
        .of(new AcompanhamentoEscolhido(banana, QuantidadeAcompanhamento.IDEAL));
    Acai meuAcai = new Acai(acompanhamentos, TamanhoAcai.GRANDE);

    System.out.println(meuAcai.toString());

  }

}
