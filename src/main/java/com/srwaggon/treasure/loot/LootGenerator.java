package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.supplier.equipment.EquipmentSupplier;
import com.srwaggon.treasure.loot.supplier.valuable.ValuableSupplier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LootGenerator {

  private final Supplier<LootItem> supplier;

  public LootGenerator(Supplier<LootItem> supplier) {
    this.supplier = supplier;
  }

  public static Collection<LootItem> generate() {
    ArrayList<LootItem> lootItems = new ArrayList<>();
    lootItems.addAll(new LootGenerator(new EquipmentSupplier()).generateUpTo(0, 3));
    lootItems.addAll(new LootGenerator(new ValuableSupplier()).generateUpTo(0, 3));
    return lootItems;
  }

  public Collection<LootItem> generateUpTo(int min, int max) {
    return generate((int) (Math.random() * (max - min + 1)) + min);
  }

  public Collection<LootItem> generateUpTo(int max) {
    return generateUpTo(0, max);
  }

  public Collection<LootItem> generate(int count) {
    return IntStream.range(0, count)
        .mapToObj(i -> supplier.get())
        .collect(Collectors.toCollection(ArrayList::new));
  }

}
