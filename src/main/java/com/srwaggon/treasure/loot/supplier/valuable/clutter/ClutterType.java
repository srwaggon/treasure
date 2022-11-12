package com.srwaggon.treasure.loot.supplier.valuable.clutter;

public enum ClutterType {

  JUG,
  PLATTER,
  RUG,
  TAPESTRY,
  VASE,
  ;

  public static ClutterType chooseOneAtRandom() {
    ClutterType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
