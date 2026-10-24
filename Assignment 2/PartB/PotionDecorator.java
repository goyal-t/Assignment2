
public abstract class PotionDecorator implements Potion {
    protected Potion potion;

    public PotionDecorator() {
        this.potion = null;
    }

    public PotionDecorator(Potion potion) {
        this.potion = potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }
    @Override 
    public abstract String getDescription();
    @Override 
    public abstract int getHealing();
    @Override 
    public abstract int getStability();
}