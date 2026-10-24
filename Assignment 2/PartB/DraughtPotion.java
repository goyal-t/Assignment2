public class DraughtPotion implements Potion{
    public DraughtPotion(){
        
    }
    @Override 
    public String getDescription(){
        return "Base Draught";
    }
    @Override 
    public int getHealing(){
        return 1;
    }
    @Override 
    public int getStability(){
        return 1;
    }
}