package com.srwaggon.treasure.loot.tag;

public class Tag {

  private TagType tagType;
  private String tagValue;
  private int priority = 1;

  public TagType getTagType() {
    return tagType;
  }

  public void setTagType(TagType tagType) {
    this.tagType = tagType;
  }

  public String getTagValue() {
    return tagValue;
  }

  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public String asString() {
    return Math.random() < 0.5
        ? String.format("%s of %s", tagType.asString(), tagValue)
        : String.format("%s %s", tagValue, tagType.asString());
  }

}

