package com.srwaggon.treasure.loot.supplier.valuable.gemstone;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class GemstoneSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(GemstoneType.chooseOneAtRandom())
        .withReasonableRandomQuality();
  }

}
