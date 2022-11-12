package com.srwaggon.treasure.loot.supplier.equipment.weapon;

public enum WeaponType {
  SWORD,
  AXE,
  DAGGER,
  PUNCHING_DAGGER,
  HAMMER,
  MACE,
  STAFF,
  WAND,
  BOW,
  CROSSBOW,
  HALBERD
  ;

  public static WeaponType chooseOneAtRandom() {
    WeaponType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
