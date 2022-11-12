package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.supplier.equipment.armor.ArmorType;
import com.srwaggon.treasure.loot.supplier.equipment.supply.SupplyType;
import com.srwaggon.treasure.loot.supplier.equipment.tool.ToolType;
import com.srwaggon.treasure.loot.supplier.equipment.weapon.WeaponType;
import com.srwaggon.treasure.loot.supplier.valuable.ValuableType;
import com.srwaggon.treasure.loot.supplier.valuable.clutter.ClutterType;
import com.srwaggon.treasure.loot.supplier.valuable.currency.CurrencyType;
import com.srwaggon.treasure.loot.supplier.valuable.gemstone.GemstoneType;
import com.srwaggon.treasure.loot.supplier.valuable.jewelry.JewelryType;

public class LootItemFactory {

  private static MetaLootItem newLootItem(String item) {
    return new MetaLootItem(item);
  }

  public static MetaLootItem newLootItem(ArmorType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ClutterType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(CurrencyType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(GemstoneType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(JewelryType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(SupplyType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ValuableType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ToolType type) {
    return newLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(WeaponType type) {
    return newLootItem(type.asString());
  }
}
