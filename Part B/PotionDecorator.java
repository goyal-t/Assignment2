public abstract class PotionDecorator implements Potion {
    protected Potion potion;

    public PotionDecorator() {
        this.potion = null;
    }

    public PotionDecorator(Potion p) {
        this.potion = p;
    }

    public void setPotion(Potion p) {
        this.potion = p;
    }

    public Potion getPotion() {
        return this.potion;
    }

    public String getDescription() {
        if (potion == null) {
            return "";
        }
        return potion.getDescription();
    }

    public int getHealing() {
        if (potion == null) {
            return 0;
        }
        return potion.getHealing();
    }

    public int getStability() {
        if (potion == null) {
            return 0;
        }
        return potion.getStability();
    }
}