import java.util.ArrayList;
import java.util.List;

import enums.TamanhoAcai;
import models.Acai;
import models.Estoque;
import models.acompanhamentos.Acompanhamento;
import models.acompanhamentos.Fruta;
import models.acompanhamentos.Recheio;
import services.AcaiService;
import services.PreencherEstoque;

public class Main {
  public static void main(String[] args) {

    Estoque estoque = PreencherEstoque.execute();

    List<Fruta> f = estoque.getFrutasEstoque();
    System.out.println(f.getFirst().detalhesAcompanhamento());

    AcaiService acaiService = new AcaiService();
    Acompanhamento banana = new Fruta("Banana", 2);
    Acompanhamento nutela = new Recheio("Nutella", 3);
    List<Acompanhamento> acompanhamentos = new ArrayList<>();
    acompanhamentos.add(banana);
    acompanhamentos.add(nutela);
    Acai meuAcai = new Acai(acompanhamentos, TamanhoAcai.GRANDE);

    acaiService.listarAcai(meuAcai);

  }

}
