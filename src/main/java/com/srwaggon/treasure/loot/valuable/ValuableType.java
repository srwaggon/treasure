package com.srwaggon.treasure.loot.valuable;

public enum ValuableType {

  ANCIENT_COIN,
  PAINTING,
  STATUE,

  DIAMOND,
  EMERALD,
  JADE,
  OPAL,
  RUBY,
  SAPPHIRE,
  TOPAZ,

  CROWN,
  NECKLACE,
  RING,

  JUG,
  PLATTER,
  RUG,
  TAPESTRY,
  VASE,
  ;

  public static ValuableType chooseOneAtRandom() {
    ValuableType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
