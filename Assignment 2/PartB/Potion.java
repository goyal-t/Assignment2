
public interface Potion extends Item{
    @Override 
    String getDescription();
    int getHealing();
    int getStability();
}