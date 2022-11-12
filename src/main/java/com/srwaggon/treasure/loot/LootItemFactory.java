package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.valuable.ValuableType;
import com.srwaggon.treasure.loot.valuable.currency.CurrencyType;
import com.srwaggon.treasure.loot.weapon.WeaponType;

public class LootItemFactory {

  public static MetaLootItem newLootItem(CurrencyType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ValuableType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(WeaponType type) {
    return newLootItem(type.asString());
  }

  private static MetaLootItem newLootItem(String item) {
    return new MetaLootItem(item);
  }

}
