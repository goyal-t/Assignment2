
public class PowderedUnicornHorn extends PotionDecorator{
    
    public PowderedUnicornHorn(){
        super();
    }
    public PowderedUnicornHorn(Potion p){
        super(p);
    }
    @Override 
    public String getDescription(){
        if(potion == null){
            return "Powdered Unicorn Horn";
        }
        return potion.getDescription() + ", Powdered Unicorn Horn";
    }
    @Override 
    public int getHealing(){
        return potion.getHealing() + 2;
    }
    @Override 
    public int getStability(){
        return potion.getStability() + 1;
    }
}
