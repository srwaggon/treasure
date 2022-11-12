package com.srwaggon.treasure.loot.valuable;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;
import com.srwaggon.treasure.loot.valuable.currency.CurrencySupplier;

import java.util.function.Supplier;

public class ValuableSupplier implements Supplier<LootItem> {

  @Override
  public LootItem get() {
    return Math.random() * 100 < 50
        ? new CurrencySupplier().get()
        : LootItemFactory.newLootItem(ValuableType.chooseOneAtRandom())
            .withReasonableRandomQuality()
            .withChanceOfMagical(5);
  }
}
