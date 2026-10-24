
public abstract class Potion implements Item{
    protected String description;
    public abstract int getStability();
    public abstract int getHealing();

    public String getDescription(){
        return description;
    }
}