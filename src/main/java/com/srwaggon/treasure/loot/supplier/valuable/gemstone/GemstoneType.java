package com.srwaggon.treasure.loot.supplier.valuable.gemstone;

public enum GemstoneType {

  DIAMOND,
  EMERALD,
  JADE,
  OPAL,
  RUBY,
  SAPPHIRE,
  TOPAZ,
  ;

  public static GemstoneType chooseOneAtRandom() {
    GemstoneType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
