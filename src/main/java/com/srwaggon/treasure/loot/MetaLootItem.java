package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.tag.MagicalTag;
import com.srwaggon.treasure.loot.tag.QualityTag;

public class MetaLootItem extends LootItem {

  public MetaLootItem(String item) {
    super(item);
  }

  public MetaLootItem withQuality(Quality quality) {
    this.withTag(QualityTag.fromQuality(quality));
    return this;
  }

  public MetaLootItem withRandomQuality() {
    this.withTag(QualityTag.chooseOneAtRandom());
    return this;
  }

  public MetaLootItem withReasonableRandomQuality() {
    int rarity = (int) (Math.random() * 100);
    QualityTag qualityTag = rarity < 20
        ? QualityTag.POOR_TAG
        : rarity < 60
            ? QualityTag.COMMON_TAG
            : rarity < 80
                ? QualityTag.FINE_TAG
                : rarity < 95
                    ? QualityTag.QUALITY_TAG
                    : QualityTag.MASTERWORK_TAG;
    this.withTag(qualityTag);
    return this;
  }

  public MetaLootItem withRandomQuantity(int min, int max) {
    this.setQuantity((int) (Math.random() * (max - min + 1)) + min);
    return this;
  }

  public MetaLootItem withRandomQuantity(int max) {
    return withRandomQuantity(1, max);
  }

  public MetaLootItem withMagicalTag() {
    this.addTag(MagicalTag.MAGICAL_TAG);
    return this;
  }

  public MetaLootItem withChanceOfMagical(int percentage) {
    if (Math.random() * 100 < percentage) {
      return this.withMagicalTag();
    }
    return this;
  }

  public MetaLootItem withChanceOfMagical() {
    return withChanceOfMagical(5);
  }
}
