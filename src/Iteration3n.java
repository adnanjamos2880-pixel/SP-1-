public class Iteration3 {

    public static void main(String[] args) {

        String navn = "Piccolo";
        int healthPoints = 50;
        int maxHealth = 500;
        int level = 10;
        int experiencePoints = 100;
        double gold = 100.0;
        boolean isAlive = true;
        char klasseType = 'W';
        String[] inventory = {"Sword", "Shield", "Healing Herb"};



        printInventory(inventory);
    }

    // Opgave 1.1
    // METODE med parameter: trækker skade fra health, returnerer den nye health-værdi
    static int takeDamage(int currentHealth, int damage) {
        return currentHealth - damage;
    }

    // Opgave 1.2 - Metode med parameter
    // Metoden skal lægge et beløb (amount) til karakterens health — men resultatet må aldrig overstige maxHealth, selv hvis man healer med et stort tal

    static int heal(int currentHealth, int amount, int maxHealth) {

        int newHealth = currentHealth + amount; // indsætter variablenre
        if (newHealth > maxHealth) {
            newHealth = maxHealth; // vi har lagt et loft. hvis new health overskrider 500, bliver den skåret ned til 500
        }

        return newHealth;
    }

    // Opgave 1.3
    // Opgavebeskrivelsen: addGold(double amount) — lægger et beløb til karakterens gold

    static double addGold(double currentGold, double amount) {
        return currentGold + amount;
    }

    // Opgbeskrivelse : removeGold- trækker et beløb fra karakterens gold, men gold må aldrig gå under 0
    static double removeGold(double currentGold, double amount) {
        double newGold = currentGold - amount;
        if (newGold < 0) {
            newGold = 0;
        }

        return newGold;
    }

    // Opgbeskrivelse: addXP(int amount) — lægger experience points til karakteren

    static int addXP(int currentXP, int amount) {
        return currentXP + amount;
    }

    // Opgbeskrivele - boolean - returnerer true hvis karakteren har health over 0, ellers false

    static boolean isAlive(int currentHealth) {
        return currentHealth > 0;
    }

    // Opgbeskrivelse - isHealthCritical() — returnerer true hvis health er under 25% af maxHealth, ellers false

    static boolean isHealthCritical(int currentHealth, int maxHealth) {
        return currentHealth < maxHealth * 0.25;
    }

    // Opgbeskrivelse - returnerer health som en procentdel af maxHealth (fx 0.75 for 75%, eller 75.0 hvis du regner det som et helt procenttal)

    static double getHealthPercentage(int currentHealth, int maxHealth) {
        return (double) currentHealth / maxHealth * 100.0;
    }

    // Opgave - printInventory() — udskriver alle items med et loop

    static void printInventory(String[] inventory) {
        System.out.println("Inventory (" + inventory.length + " items):");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("- " + inventory[i]); // printer hvert item automatisk
        }
    }
}