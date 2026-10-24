
public class PowderedUnicornHorn extends PotionDecorator{
    
    public PowderedUnicornHorn(){
        super();
    }
    public PowderedUnicornHorn(Potion p){
        super(p);
    }
    public String getDescription(){
        if(potion == null){
            return "Powdered Unicorn Horn";
        }
        return potion.getDescription() + ", Powdered Unicorn Horn";
    }
    public int getHealing(){
        return potion.getHealing() + 2;
    }
    public int getStability(){
        return potion.getStability() + 1;
    }
}
