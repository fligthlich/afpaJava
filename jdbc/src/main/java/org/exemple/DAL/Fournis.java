package org.exemple.DAL;


public class Fournis {


  private int numfou;
  private String nomfou;
  private String ruefou;
  private String posfou;
  private String vilfou;
  private String confou;

  public Entcom getEntcom() {
    return entcom;
  }

  public void setEntcom(Entcom entcom) {
    this.entcom = entcom;
  }

  private Entcom entcom;
  private int satisf;


  public Fournis() {
  }

  public Fournis(int numfou, String nomfou, String ruefou, String posfou, String vilfou, String confou, int satisf) {
    this.numfou = numfou;
    this.nomfou = nomfou;
    this.ruefou = ruefou;
    this.posfou = posfou;
    this.vilfou = vilfou;
    this.confou = confou;
    this.satisf = satisf;
  }



  public int getNumfou() {
    return numfou;
  }

  public void setNumfou(int numfou) {
    this.numfou = numfou;
  }


  public String getNomfou() {
    return nomfou;
  }

  public void setNomfou(String nomfou) {
    this.nomfou = nomfou;
  }


  public String getRuefou() {
    return ruefou;
  }

  public void setRuefou(String ruefou) {
    this.ruefou = ruefou;
  }


  public String getPosfou() {
    return posfou;
  }

  public void setPosfou(String posfou) {
    this.posfou = posfou;
  }


  public String getVilfou() {
    return vilfou;
  }

  public void setVilfou(String vilfou) {
    this.vilfou = vilfou;
  }


  public String getConfou() {
    return confou;
  }

  public void setConfou(String confou) {
    this.confou = confou;
  }


  public int getSatisf() {
    return satisf;
  }

  public void setSatisf(int satisf) {
    this.satisf = satisf;
  }

  @Override
  public String toString() {
    return "Fournis{" +
            "numfou=" + numfou +
            ", nomfou='" + nomfou + '\'' +
            ", ruefou='" + ruefou + '\'' +
            ", posfou='" + posfou + '\'' +
            ", vilfou='" + vilfou + '\'' +
            ", confou='" + confou + '\'' +
            ", satisf=" + satisf +
            '}';
  }
}
