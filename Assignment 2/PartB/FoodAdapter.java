
public class FoodAdapter implements  Potion{
    private final Food food;
    public FoodAdapter(Food f){
        food = f;
    }
    @Override 
    public String getDescription(){
        return "Elixir of Froth";
    }
    @Override 
    public int getHealing(){
        return food.getEnergy();
    }
    @Override 
    public int getStability(){
        return 0;
    }
    
}