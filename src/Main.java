//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Iteration 1
//      // vi starter med at erklære variablerne                   // v

        String navn = "Piccolo";
        int healthPoints = 50;
        int maxHealth = 500;
        int level = 10;
        int experiencePoints = 100;
        double gold = 100.0;
        boolean isAlive = true;
        char klasseType = 'W';


        String[] inventory = {"Sword", "Shield", "Healing Herb"};
             // Nu laver vi et string array

        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + navn);
        System.out.println("Class: " + klasseType);
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("XP: " + experiencePoints);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);
        System.out.println();
        System.out.println("Inventory (" + inventory.length + " items):");
        System.out.println("- " + inventory[0]);
        System.out.println("- " + inventory[1]);
        System.out.println("- " + inventory[2]);



    }

}