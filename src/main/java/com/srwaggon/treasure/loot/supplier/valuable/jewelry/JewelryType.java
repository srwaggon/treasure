package com.srwaggon.treasure.loot.supplier.valuable.jewelry;

public enum JewelryType {

  CROWN,
  NECKLACE,
  RING,
  ;

  public static JewelryType chooseOneAtRandom() {
    JewelryType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
