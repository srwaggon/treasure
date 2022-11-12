package com.srwaggon.treasure.loot.valuable.currency;

import com.srwaggon.treasure.loot.valuable.ValuableType;

public enum CurrencyType {
  COPPER_PIECES,
  GOLD_PIECES,
  SILVER_PIECES,
  ;

  public static CurrencyType chooseOneAtRandom() {
    CurrencyType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }
}
