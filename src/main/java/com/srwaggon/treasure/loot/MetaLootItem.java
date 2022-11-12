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
    double roll = Math.random();
    if (roll < 0.5) {
      return this;
    }
    QualityTag qualityTag = roll < 0.55 ? QualityTag.BROKEN_TAG
        : roll < 0.65 ? QualityTag.POOR_TAG
            : roll < 0.8 ? QualityTag.FINE_TAG
                : roll < .95 ? QualityTag.QUALITY_TAG
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
