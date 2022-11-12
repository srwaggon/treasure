package com.srwaggon.treasure.loot.supplier.equipment.tool;

public enum ToolType {

  BELL,
  BUCKET,
  CHISEL,
  COMPASS,
  COOKING_POTS,
  CROWBAR,
  FLASK,
  FISHING_POLE,
  GRAPPLING_HOOK,
  HAMMOCK,
  HOURGLASS,
  HUNTING_TRAP,
  GRINDSTONE,
  LADDER,
  LAMP,
  LOCK,
  MAGNET,
  MAGNIFYING_GLASS,
  MESS_KIT,
  METAL_SPIKE,
  MIRROR,
  PICKAXE,
  PITCHFORK,
  PITON,
  POLE,
  QUIVER,
  SACK,
  SADDLE,
  SHEARS,
  SHOVEL,
  SMITHING_HAMMER,
  SPYGLASS,
  TENT,
  WHETSTONE,
  WHISTLE,
  WOODCUTTING_AXE,
  ;

  public static ToolType chooseOneAtRandom() {
    ToolType[] values = values();
    return values[(int) (Math.random() * values.length)];
  }

  public String asString() {
    return this.name().toLowerCase().replace("_", " ");
  }

}
