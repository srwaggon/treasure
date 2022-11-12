package com.srwaggon.treasure.loot.tag;

import com.srwaggon.treasure.loot.Quality;

import java.util.Arrays;

public class QualityTag extends Tag {

  private static final TagType QUALITY_TAG_TYPE = new TagType("quality");

  public static final QualityTag MASTERWORK_TAG = new QualityTag(Quality.MASTERWORK);
  public static final QualityTag QUALITY_TAG = new QualityTag(Quality.QUALITY);
  public static final QualityTag FINE_TAG = new QualityTag(Quality.FINE);
  public static final QualityTag COMMON_TAG = new QualityTag(Quality.COMMON);
  public static final QualityTag POOR_TAG = new QualityTag(Quality.POOR);

  private static final QualityTag[] qualityTags = new QualityTag[]{MASTERWORK_TAG, QUALITY_TAG, FINE_TAG, COMMON_TAG, POOR_TAG};

  private final Quality quality;

  private QualityTag(Quality quality) {
    this.setTagType(QUALITY_TAG_TYPE);
    this.setTagValue(quality.asString());
    this.setPriority(10);
    this.quality = quality;
  }

  @Override
  public String asString() {
    return getTagValue();
  }

  public static QualityTag chooseOneAtRandom() {
    return qualityTags[(int) (qualityTags.length * Math.random())];
  }

  public static QualityTag fromQuality(Quality quality) {
    return Arrays.stream(qualityTags).filter(tag -> tag.quality == quality).findFirst().get();
  }

}
