package com.srwaggon.treasure.loot.supplier.equipment.tool;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class ToolSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(ToolType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(10);
  }

}
