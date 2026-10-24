public class MandrakeRoot extends PotionDecorator{
    public MandrakeRoot(){
        super();
    }
    
    public MandrakeRoot(Potion p){
        super(p);
    }
    @Override 
    public String getDescription(){
        if(potion == null){
            return "Mandrake Root";
        }
        return potion.getDescription() + ", Mandrake Root";
    }
    @Override 
    public int getHealing(){
        return potion.getHealing() + 1;
    }
    @Override 
    public int getStability(){
        return potion.getStability() + 2;
    }
}