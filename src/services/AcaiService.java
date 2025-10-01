package services;

import java.util.List;

import models.Acai;
import models.acompanhamentos.Acompanhamento;

public class AcaiService {
  public void listarAcai(Acai acai) {

    String detalhes = "";

    detalhes += acai.getTamanhoAcai();
    detalhes += acai.getPreco();

    List<Acompanhamento> acompanhamentos = acai.getAcompanhamentos();
    for (Acompanhamento acompanhamento : acompanhamentos) {
      System.out.println(acompanhamento.detalhesAcompanhamento());
    }
  }
}
