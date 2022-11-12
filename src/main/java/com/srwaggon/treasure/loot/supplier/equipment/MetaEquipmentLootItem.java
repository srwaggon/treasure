package com.srwaggon.treasure.loot.supplier.equipment;

import com.srwaggon.treasure.loot.Material;
import com.srwaggon.treasure.loot.MetaLootItem;
import com.srwaggon.treasure.loot.tag.MaterialTag;

public class MetaEquipmentLootItem extends MetaLootItem {

  public MetaEquipmentLootItem(String item) {
    super(item);
  }

  public MetaEquipmentLootItem withMaterial(Material material) {
    this.withTag(MaterialTag.fromMaterial(material));
    return this;
  }

  public MetaEquipmentLootItem withRandomMaterial() {
    return withMaterial(Material.chooseOneAtRandom());
  }

}
