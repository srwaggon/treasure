package com.srwaggon.treasure.loot.supplier.equipment.supply;

public enum SupplyType {

  ARROWS,
  BANDAGES,
  BLANKET,
  BOLTS,
  BOOK,
  CANDLE,
  CHAIN,
  CLOAK,
  HEALING_POTION,
  HEALERS_KIT,
  OIL,
  POUCH,
  QUILL_AND_INK,
  RATION,
  ROPE,
  SACK,
  STACK_OF_PAPER,
  TINDER_KIT,
  TORCH,
  WATERSKIN,
  ;

  public static SupplyType chooseOneAtRandom() {
    SupplyType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
