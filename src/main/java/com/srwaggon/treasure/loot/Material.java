package com.srwaggon.treasure.loot;

public enum Material {

  CLOTH,
  GLASS,
  HIDE,
  IRON,
  LEATHER,
  STEEL,
  WOOD,
  ;

  public static Material chooseOneAtRandom() {
    Material[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
