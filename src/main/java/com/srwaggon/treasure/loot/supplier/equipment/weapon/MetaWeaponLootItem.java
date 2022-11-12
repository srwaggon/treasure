package com.srwaggon.treasure.loot.supplier.equipment.weapon;

import com.srwaggon.treasure.loot.Material;
import com.srwaggon.treasure.loot.supplier.equipment.MetaEquipmentLootItem;
import com.srwaggon.treasure.loot.tag.MaterialTag;

public class MetaWeaponLootItem extends MetaEquipmentLootItem {

  private static final Material[] weaponMaterials = new Material[]{
      Material.GLASS,
      Material.IRON,
      Material.STEEL,
      Material.WOOD,
  };

  public MetaWeaponLootItem(String item) {
    super(item);
  }

  public MetaWeaponLootItem withRandomWeaponMaterial() {
    this.withTag(MaterialTag.fromMaterial(randomWeaponMaterial()));
    return this;
  }

  private Material randomWeaponMaterial() {
    return weaponMaterials[(int) (Math.random() * weaponMaterials.length)];
  }

}
