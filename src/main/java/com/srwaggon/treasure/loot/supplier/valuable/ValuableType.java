package com.srwaggon.treasure.loot.supplier.valuable;

public enum ValuableType {

  ANCIENT_COIN,
  PAINTING,
  STATUE,
  ;

  public static ValuableType chooseOneAtRandom() {
    ValuableType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
