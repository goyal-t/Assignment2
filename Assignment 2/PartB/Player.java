public class Player {
    private int health;
    private Potion potion;
    private Potion specialPotion;

    public Player(int health) {
        this.health = health;
        this.potion = null;
        this.specialPotion = null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public Potion getSpecialPotion() {
        return specialPotion;
    }

    public void setSpecialPotion(Potion specialPotion) {
        this.specialPotion = specialPotion;
    }

    public void eatFood(Food food) {
        health += food.getEnergy();
        System.out.println("[Ate the " + food.getDescription().toLowerCase() + "]");
        System.out.println("Health: " + health + " HP");
    }

    public void addEnhancement(Potion targetPotion, Potion enhancement) {
        if (enhancement instanceof PowderedUnicornHorn) {
            ((PowderedUnicornHorn) enhancement).setPotion(targetPotion);
        } else if (enhancement instanceof MandrakeRoot) {
            ((MandrakeRoot) enhancement).setPotion(targetPotion);
        } else if (enhancement instanceof PhoenixFeather) {
            ((PhoenixFeather) enhancement).setPotion(targetPotion);
        }
        if (targetPotion == this.potion) {
            this.potion = enhancement;
        } else if (targetPotion == this.specialPotion) {
            this.specialPotion = enhancement;
        }
    }

    public String getPotionDescription() {
        if (potion == null) return "";
        return potion.getDescription() + "\t|\thealing: " + potion.getHealing() + "\t|\tstability: " + potion.getStability();
    }

    public String getSpecialPotionDescription() {
        if (specialPotion == null) return "";
        return specialPotion.getDescription() + "\t|\thealing: " + specialPotion.getHealing() + "\t|\tstability: " + specialPotion.getStability();
    }
}