package com.srwaggon.treasure.loot.supplier.valuable.jewelry;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class JewelrySupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(JewelryType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(10);
  }

}
