package com.srwaggon.treasure.loot.supplier.equipment.armor;

import com.srwaggon.treasure.loot.Material;
import com.srwaggon.treasure.loot.supplier.equipment.MetaEquipmentLootItem;
import com.srwaggon.treasure.loot.tag.MaterialTag;

public class MetaArmorLootItem extends MetaEquipmentLootItem {

  private static final Material[] armorMaterials = new Material[]{
      Material.CLOTH,
      Material.HIDE,
      Material.IRON,
      Material.LEATHER,
      Material.STEEL,
      Material.WOOD,
  };

  public MetaArmorLootItem(String item) {
    super(item);
  }

  public MetaArmorLootItem withRandomArmorMaterial() {
    this.withTag(MaterialTag.fromMaterial(randomArmorMaterial()));
    return this;
  }

  private Material randomArmorMaterial() {
    return armorMaterials[(int) (Math.random() * armorMaterials.length)];
  }

}
