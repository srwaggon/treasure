package com.srwaggon.treasure.loot.supplier.equipment;

import com.srwaggon.treasure.loot.LootItem;
import com.srwaggon.treasure.loot.supplier.equipment.armor.ArmorSupplier;
import com.srwaggon.treasure.loot.supplier.equipment.supply.SupplySupplier;
import com.srwaggon.treasure.loot.supplier.equipment.tool.ToolSupplier;
import com.srwaggon.treasure.loot.supplier.equipment.weapon.WeaponSupplier;

import java.util.function.Supplier;

public class EquipmentSupplier implements Supplier<LootItem> {

  private final SupplySupplier supplySupplier = new SupplySupplier();
  private final ArmorSupplier armorSupplier = new ArmorSupplier();
  private final WeaponSupplier weaponSupplier = new WeaponSupplier();
  private final ToolSupplier toolSupplier = new ToolSupplier();

  @Override
  public LootItem get() {
    double roll = Math.random();
    return roll < 0.3
        ? supplySupplier.get()
        : roll < 0.6
            ? toolSupplier.get()
            : roll < 0.8
                ? armorSupplier.get()
                : weaponSupplier.get();
  }

}
