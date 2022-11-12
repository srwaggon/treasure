package com.srwaggon.treasure.loot.supplier.valuable;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.LootItemFactory;
import com.srwaggon.treasure.loot.supplier.valuable.clutter.ClutterSupplier;
import com.srwaggon.treasure.loot.supplier.valuable.currency.CurrencySupplier;
import com.srwaggon.treasure.loot.supplier.valuable.jewelry.JewelrySupplier;
import com.srwaggon.treasure.loot.supplier.valuable.gemstone.GemstoneSupplier;

import java.util.function.Supplier;

public class ValuableSupplier implements Supplier<LootItem> {

  private final CurrencySupplier currencySupplier = new CurrencySupplier();
  private final GemstoneSupplier gemstoneSupplier = new GemstoneSupplier();
  private final JewelrySupplier jewelrySupplier = new JewelrySupplier();
  private final ClutterSupplier clutterSupplier = new ClutterSupplier();

  @Override
  public LootItem get() {
    double roll = Math.random();
    return roll < 0.3
        ? currencySupplier.get()
        : roll < 0.60
            ? clutterSupplier.get()
            : roll < 0.80
                ? getMiscValuable()
                : roll < 0.95
                    ? jewelrySupplier.get()
                    : gemstoneSupplier.get();
  }

  private LootItem getMiscValuable() {
    return LootItemFactory.newLootItem(ValuableType.chooseOneAtRandom())
        .withReasonableRandomQuality()
        .withChanceOfMagical(5);
  }

}
