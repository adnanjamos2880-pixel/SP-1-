public class Iteration2ny {

        // Den her del handler om Control Structures (if statements og loops)

        public static void main(String[] args) {

            // Variabler kopieret fra Iteration 1
            String navn = "Piccolo";
            int healthPoints = 50;
            int maxHealth = 500;
            int level = 10;
            int experiencePoints = 100;
            double gold = 100.0;
            boolean isAlive = true;
            char klasseType = 'W';
            String[] inventory = {"Sword", "Shield", "Healing Herb"};

            // Opgave 2.1 - Hvis health er under 25% af max health, udskriv "WARNING: Health critical!"
            if (healthPoints < maxHealth * 0.25) {
                System.out.println("WARNING: Health critical!");
            }

            // Opgave 2.2 - Hvis karakteren har 0 eller mindre health, sæt isAlive til false
            if (healthPoints <= 0) {
                isAlive = false;
            }

            // Opgave 2.3 - Udskriv forskellige beskeder baseret på klasse ('W', 'M', 'R')
            if (klasseType == 'W') {
                System.out.println("A mighty warrior stands ready.");
            } else if (klasseType == 'M') {
                System.out.println("Arcane energy surrounds the mage.");
            } else if (klasseType == 'R') {
                System.out.println("A shadow moves silently.");
            }

            // Opgave 2.4 - Hvis XP er over en threshold, udskriv "Ready to level up!"
            if (experiencePoints > 1000 * level) {
                System.out.println("Ready to level up!");
            }

            // Opgave 2.5 - Inventory med loop
            System.out.println("Inventory (" + inventory.length + " items):");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("- " + inventory[i]);
            }

            // Opgave 2.6 - Combat simulation
            int incomingDamage = 30;
            healthPoints = healthPoints - incomingDamage;

            if (healthPoints <= 0) {
                isAlive = false;
            }

            System.out.println(navn + " took " + incomingDamage + " damage!");
            System.out.println("Health remaining: " + healthPoints);
            System.out.println("Alive: " + isAlive);
        }
    }
}
