package com.srwaggon.treasure.loot.tag;

public class MagicalTag extends Tag {

  private static final TagType MAGICAL_TAG_TYPE = new TagType("magical");
  public static final MagicalTag MAGICAL_TAG = new MagicalTag();

  public MagicalTag() {
    this.setTagType(MAGICAL_TAG_TYPE);
    this.setTagValue("magical");
    this.setPriority(5);
  }

  @Override
  public String asString() {
    return this.getTagValue();
  }
}
