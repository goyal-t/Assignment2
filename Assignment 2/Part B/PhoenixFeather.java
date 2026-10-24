public class PhoenixFeather extends PotionDecorator{
    
    public PhoenixFeather(){
        super();
    }
    public PhoenixFeather(Potion p){
        super(p);
    }
    public String getDescription(){
        if(potion == null){
            return "Phoenix Feather";
        }
        return potion.getDescription() + ", Phoenix Feather";
    }
    public int getHealing(){
        return potion.getHealing() + 3;
    }
    public int getStability(){
        return potion.getStability() + 3;
    }
}
