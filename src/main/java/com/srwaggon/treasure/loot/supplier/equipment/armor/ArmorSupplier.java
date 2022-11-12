package com.srwaggon.treasure.loot.supplier.equipment.armor;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class ArmorSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(ArmorType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(10);
  }

}
