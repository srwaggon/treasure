package com.srwaggon.treasure.loot.supplier.valuable.currency;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;

import java.util.function.Supplier;

public class CurrencySupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return LootItemFactory.newLootItem(CurrencyType.chooseOneAtRandom())
        .withRandomQuantity(100);
  }

}
