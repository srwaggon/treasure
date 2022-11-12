package com.srwaggon.treasure.loot;

public enum Quality {
  MASTERWORK,
  QUALITY,
  FINE,
  COMMON,
  POOR,
  BROKEN,
  ;

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
