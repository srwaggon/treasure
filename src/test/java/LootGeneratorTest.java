import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class LootGeneratorTest {

  @Test
  public void generate_GeneratesLoot() {
    assertGenerates("sword");
    assertGenerates("axe");
    assertGenerates("dagger");
    assertGenerates("punching dagger");
    assertGenerates("hammer");
    assertGenerates("mace");
    assertGenerates("staff");
    assertGenerates("wand");
    assertGenerates("bow");
    assertGenerates("crossbow");
    assertGenerates("halberd");
    assertGenerates("gold piece");
  }

  @Test
  public void generate_GeneratesOneWeaponAndOneCurrency() {
    // assembly - any setup / preconditions, etc.

    // action - behaviour
    String[] actual = LootGenerator.generate();

    // assertion - verification
    assertEquals(true, isAWeapon(actual[0]));
    assertEquals("gold piece", actual[1]);
  }

  // isAWeapon returns true if the provided string is a weapon
  // and false otherwise
  private boolean isAWeapon(String item) {
    return item.equals("sword") ||
        item.equals("axe") ||
        item.equals("dagger") ||
        item.equals("punching dagger") ||
        item.equals("hammer") ||
        item.equals("mace") ||
        item.equals("staff") ||
        item.equals("wand") ||
        item.equals("bow") ||
        item.equals("crossbow") ||
        item.equals("halberd");
  }

  private void assertGenerates(String expected) {
    for (int i = 0; i < 100; i++) {
      String[] actual = LootGenerator.generate();
      if (doesLootListContain(actual, expected)) {
        return;
      }
    }
    fail("Expected to generate '" + expected + "'; never generated out of 100 tries.");
  }

  private boolean doesLootListContain(String[] lootList, String item) {
    for (int j = 0; j < lootList.length; j++) {
      String itemAtIndexJ = lootList[j];
      if (item.equals(itemAtIndexJ)) {
        return true;
      }
    }
    return false;
  }

}