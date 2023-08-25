package com.trybe.acc.java.planejamentodeviagem;

/**
 * class que recebe os dados dos usuarios no Principal e faz a viagem interagindo com o Tempo e Voo.
 */
public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    /* Implemente sua solução aqui (você pode ter que alterar o construtor) */
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    /* Implemente sua solução aqui */
    return voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    /* Implemente sua solução aqui */
    return voo.retornarInformacaoVoo(this.embarque, this.origem,
            tempoViagem.retonarDesembarqueHorarioLocalDestino(), this.destino);
  }
}
