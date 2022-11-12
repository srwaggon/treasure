package com.srwaggon.treasure.loot;

import com.srwaggon.treasure.loot.tag.Tag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LootItem {
  private Collection<Tag> tags = new ArrayList<>();
  private int quantity = 1;
  private String item;

  public LootItem(String item) {
    this.item = item;
  }

  public void addTag(Tag tag) {
    tags.add(tag);
  }

  public boolean removeTag(Tag tag) {
    return tags.remove(tag);
  }

  public LootItem withTag(Tag tag) {
    addTag(tag);
    return this;
  }

  public Collection<Tag> getTags() {
    return tags;
  }

  public void setTags(Collection<Tag> tags) {
    this.tags = tags;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  @Override
  public String toString() {
    Map<Boolean, List<Tag>> tagsByPriority = getTags().stream()
        .collect(Collectors.partitioningBy(tag -> tag.getPriority() > 0));

    String quantity = this.quantity > 1 ? "" + getQuantity() + " " : "";

    String prependTags = tagsByPriority.get(true).stream().sorted((t0, t1) -> t1.getPriority() - t0.getPriority()).map(Tag::asString).collect(Collectors.joining(" "));
    String prepend = prependTags.length() > 0 ? prependTags + " " : "";

    String appendTags = tagsByPriority.get(false).stream().sorted(Comparator.comparingInt(Tag::getPriority)).map(Tag::asString).collect(Collectors.joining(" "));
    String append = appendTags.length() > 0 ? " " + appendTags : "";

    return String.format("%s%s%s%s", quantity, prepend, item, append);
  }
}
