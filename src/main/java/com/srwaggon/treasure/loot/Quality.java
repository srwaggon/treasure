package com.srwaggon.treasure.loot;

public enum Quality {

  MASTERWORK,
  QUALITY,
  FINE,
  COMMON,
  POOR,
  BROKEN,
  ;

  public static Quality chooseOneAtRandom() {
    Quality[] values = values();
    return values[(int) (Math.random() * values.length)];
  }


  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
