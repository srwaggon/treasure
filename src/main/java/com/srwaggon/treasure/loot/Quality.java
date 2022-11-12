package com.srwaggon.treasure.loot;

public enum Quality {
  MASTERWORK,
  QUALITY,
  FINE,
  COMMON,
  POOR,
  ;

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
