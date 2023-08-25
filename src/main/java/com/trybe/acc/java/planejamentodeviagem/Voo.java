package com.trybe.acc.java.planejamentodeviagem;

/**
 * calcula o tempo do voo baseado na distancia em km,
 * e fornece informações sobre o voo horarios baseados nos fusos horarios com ajuda do Tempo.
 */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;
    /* Implemente sua solução aqui */
    tempoVoo = duracaoDouble.intValue();
    return tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    /* Implemente sua solução aqui */
    Tempo tempo = new Tempo(embarque, origem, destino, tempoVoo);
    String informacaoVoo = "Atenção: o desembarque em " + destino + " será: " + desembarque
        + " no horário de " + tempo.retonarDesembarqueHorarioLocalDestino() + " e " 
        + tempo.retonarDesembarqueHorarioLocalOrigem() + "  no horário de " + origem;
    return informacaoVoo;
  }
}
