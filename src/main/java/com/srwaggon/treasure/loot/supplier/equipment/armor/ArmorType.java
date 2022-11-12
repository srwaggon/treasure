package com.srwaggon.treasure.loot.supplier.equipment.armor;

public enum ArmorType {

  HELMET,
  CHESTPIECE,
  GLOVES,
  LEGGINGS,
  BOOTS,
  SHIELD,
  ;

  public static ArmorType chooseOneAtRandom() {
    ArmorType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
