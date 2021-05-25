package org.exemple.DAL;

import java.sql.Timestamp;

public class Entcom {

  private int numcom;
  private String obscom;
  private Timestamp datcom;
  private int numfou;

  public Entcom() {
  }

  public Entcom(int numcom, String obscom, Timestamp datcom) {
    this.numcom = numcom;
    this.obscom = obscom;
    this.datcom = datcom;
  }

  public int getNumcom() {
    return numcom;
  }

  public void setNumcom(int numcom) {
    this.numcom = numcom;
  }


  public String getObscom() {
    return obscom;
  }

  public void setObscom(String obscom) {
    this.obscom = obscom;
  }


  public Timestamp getDatcom() {
    return datcom;
  }

  public void setDatcom(Timestamp datcom) {
    this.datcom = datcom;
  }


  public long getNumfou() {
    return numfou;
  }

  public void setNumfou(int numfou) {
    this.numfou = numfou;
  }

  @Override
  public String toString() {
    return "Entcom{" +
            "numcom=" + numcom +
            ", obscom='" + obscom + '\'' +
            ", datcom=" + datcom +
            ", numfou=" + numfou +
            '}';
  }
}
