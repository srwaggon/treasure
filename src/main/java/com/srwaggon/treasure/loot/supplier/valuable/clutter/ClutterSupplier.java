package com.srwaggon.treasure.loot.supplier.valuable.clutter;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class ClutterSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(ClutterType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(10);
  }

}
