package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.supplier.equipment.MetaEquipmentLootItem;
import com.srwaggon.treasure.loot.supplier.equipment.armor.ArmorType;
import com.srwaggon.treasure.loot.supplier.equipment.armor.MetaArmorLootItem;
import com.srwaggon.treasure.loot.supplier.equipment.supply.SupplyType;
import com.srwaggon.treasure.loot.supplier.equipment.tool.ToolType;
import com.srwaggon.treasure.loot.supplier.equipment.weapon.MetaWeaponLootItem;
import com.srwaggon.treasure.loot.supplier.equipment.weapon.WeaponType;
import com.srwaggon.treasure.loot.supplier.valuable.ValuableType;
import com.srwaggon.treasure.loot.supplier.valuable.clutter.ClutterType;
import com.srwaggon.treasure.loot.supplier.valuable.currency.CurrencyType;
import com.srwaggon.treasure.loot.supplier.valuable.gemstone.GemstoneType;
import com.srwaggon.treasure.loot.supplier.valuable.jewelry.JewelryType;

public class LootItemFactory {

  public static MetaArmorLootItem newLootItem(ArmorType type) {
    return new MetaArmorLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ClutterType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(CurrencyType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(GemstoneType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(JewelryType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(SupplyType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaLootItem newLootItem(ValuableType type) {
    return new MetaLootItem(type.asString());
  }

  public static MetaEquipmentLootItem newLootItem(ToolType type) {
    return new MetaEquipmentLootItem(type.asString());
  }

  public static MetaWeaponLootItem newLootItem(WeaponType type) {
    return new MetaWeaponLootItem(type.asString());
  }
}
