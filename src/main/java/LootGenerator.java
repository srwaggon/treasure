public class LootGenerator {

  public static String[] generate() {

    String[] weapons = new String[]{
        "sword",
        "axe",
        "dagger",
        "punching dagger",
        "hammer",
        "mace",
        "staff",
        "wand",
        "bow",
        "crossbow",
        "halberd"
    };

    int length = weapons.length;

    double randomDouble = Math.random(); // [0.0 - 1.0)

    int indexOfChosenWeapon = (int) (randomDouble * length);

    String chosenWeapon = weapons[indexOfChosenWeapon];

    String[] loot = new String[]{chosenWeapon, "gold piece"};

    return loot;
  }

}
