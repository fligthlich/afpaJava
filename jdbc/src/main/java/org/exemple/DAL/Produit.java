package org.exemple.DAL;


public class Produit {

  private String codart;
  private String libart;
  private int stkale;
  private int stkphy;
  private int qteann;
  private String unimes;

  public Produit() {
  }

  public Produit(String codart, String libart, int stkale, int stkphy, int qteann, String unimes) {
    this.codart = codart;
    this.libart = libart;
    this.stkale = stkale;
    this.stkphy = stkphy;
    this.qteann = qteann;
    this.unimes = unimes;
  }

  public String getCodart() {
    return codart;
  }

  public void setCodart(String codart) {
    this.codart = codart;
  }


  public String getLibart() {
    return libart;
  }

  public void setLibart(String libart) {
    this.libart = libart;
  }


  public long getStkale() {
    return stkale;
  }

  public void setStkale(int stkale) {
    this.stkale = stkale;
  }


  public long getStkphy() {
    return stkphy;
  }

  public void setStkphy(int stkphy) {
    this.stkphy = stkphy;
  }


  public long getQteann() {
    return qteann;
  }

  public void setQteann(int qteann) {
    this.qteann = qteann;
  }


  public String getUnimes() {
    return unimes;
  }

  public void setUnimes(String unimes) {
    this.unimes = unimes;
  }

}
