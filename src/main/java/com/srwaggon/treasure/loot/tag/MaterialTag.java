package com.srwaggon.treasure.loot.tag;

import com.srwaggon.treasure.loot.Material;

import java.util.Arrays;

public class MaterialTag extends Tag {

  private static final TagType MATERIAL_TAG_TYPE = new TagType("material");

  public static final MaterialTag CLOTH_TAG = new MaterialTag(Material.CLOTH);
  public static final MaterialTag GLASS_TAG = new MaterialTag(Material.GLASS);
  public static final MaterialTag HIDE_TAG = new MaterialTag(Material.HIDE);
  public static final MaterialTag IRON_TAG = new MaterialTag(Material.IRON);
  public static final MaterialTag LEATHER_TAG = new MaterialTag(Material.LEATHER);
  public static final MaterialTag STEEL_TAG = new MaterialTag(Material.STEEL);
  public static final MaterialTag WOOD_TAG = new MaterialTag(Material.WOOD);

  private static final MaterialTag[] materialTags = new MaterialTag[]{
      CLOTH_TAG,
      GLASS_TAG,
      HIDE_TAG,
      IRON_TAG,
      LEATHER_TAG,
      STEEL_TAG,
      WOOD_TAG,
  };

  private final Material material;

  private MaterialTag(Material material) {
    this.setTagType(MATERIAL_TAG_TYPE);
    this.setTagValue(material.asString());
    this.setPriority(3);
    this.material = material;
  }

  @Override
  public String asString() {
    return getTagValue();
  }

  public static MaterialTag chooseOneAtRandom() {
    return materialTags[(int) (materialTags.length * Math.random())];
  }

  public static MaterialTag fromMaterial(Material material) {
    return Arrays.stream(materialTags).filter(tag -> tag.material == material).findFirst().get();
  }

}
