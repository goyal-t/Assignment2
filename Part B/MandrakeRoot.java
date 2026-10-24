public class MandrakeRoot extends PotionDecorator{
    
    public MandrakeRoot(){
        super();
    }
    
    public MandrakeRoot(Potion p){
        psuper(p);
    }
    public void setPotion(Potion p){
        potion = p;
    }
    public String getDescription(){
        if(potion == null){
            return "Mandrake Root";
        }
        return potion.getDescription() + ", Mandrake Root";
    }
    public int getHealing(){
        return potion.getHealing() + 1;
    }
    public int getStability(){
        return potion.getStability() + 2;
    }
}