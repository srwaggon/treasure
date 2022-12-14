package com.srwaggon.treasure.loot.supplier.equipment.supply;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class SupplySupplier implements Supplier<LootItem> {
  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(SupplyType.chooseOneAtRandom());
  }
}
