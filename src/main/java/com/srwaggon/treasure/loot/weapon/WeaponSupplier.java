package com.srwaggon.treasure.loot.weapon;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class WeaponSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(WeaponType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(10);
  }

}
