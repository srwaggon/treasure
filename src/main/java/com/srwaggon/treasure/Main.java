package com.srwaggon.treasure;

import com.srwaggon.treasure.loot.LootGenerator;

import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    System.out.println("You open the chest and it contains:");
    System.out.println(LootGenerator.generate().stream()
        .map(s -> " - " + s)
        .collect(Collectors.joining("\n")));
  }
}
