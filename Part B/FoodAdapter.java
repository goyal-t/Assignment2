
public class FoodAdapter implements Potion{
    private Food food;
    public FoodAdapter(Food f){
        food = f;
    }
    
    public String getDescription(){
        return "Elixir of Froth";
    }
    
    public int getHealing(){
        return food.getEnergy();
    }
    public int getStability(){
        return 0;
    }
    
}