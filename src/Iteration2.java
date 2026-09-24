public class Iteration2 {
    // Den her del handler om Control Structures (if statements og loops)


     public static void main(String[] args) {

         // Opgave 2.1 Hvis health er under 25% af max health, udskriv "WARNING: Health critical!" - if state

         if (healthPoints < maxHealth * 0.25) {        // Vi ganger med 0.25 for at finde procenten
             System.out.println("WARNING: Health critical!");

         }
         // Opgave 2.2 boolean - Hvis karakteren har 0 eller mindre health, sæt isAlive til false

         if (healthPoints <= 0) {
             isALive = false;
         }

         // Opgave 2.3 if else statement - Udskriv forskellige beskeder baseret på klasse ('W', 'M', 'R')

         if (klasseType == 'W') {
             System.out.println("A mighty warrior stands ready.");
         } else if (klasseType == 'M') {
             System.out.println("Arcane energy surrounds the mage.");
         } else if (klasseType == 'R') {
             System.out.println("A shadow moves silently.");
         }

         // Opgave 2.4 - Hvis XP er over en threshold (fx 1000 * current level), udskriv "Ready to level up!"

         if (experiencePoints > 1000 * level) {
             System.out.println("Ready to level up!");
         }

         // Opgave 2.5 -

         System.out.println("Inventory (" + inventory.length + " items):");
         for (int i = 0; i < inventory.length; i++) {
             System.out.println("- " + inventory[i]);






     }

}
