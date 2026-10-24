import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
public class PartBDriver{
    public static void main(String[] args){
        Player player = new Player(1);

        System.out.println("***************************************");
        System.out.println("***     Wizard World Simulation     ***");
        System.out.println("***************************************");

        Item i = randomItem();
        int butterbeerCount = 0;
        Boolean loop = true;

        while(loop){
            int takeItem = JOptionPane.showConfirmDialog(null, i.getDescription()+": pick up?", null, JOptionPane.YES_NO_OPTION);
            if(takeItem == JOptionPane.YES_OPTION){

                if( i instanceof DraughtPotion){
                    player.setPotion((Potion)i);
                    System.out.println("New potion: "+i.getDescription().toLowerCase());
                    System.out.println(i.getDescription()+"\t|\thealing: "+player.getPotion().getHealing()+"\t|\tstability: "+player.getPotion().getStability());
                }else if(i instanceof Food){
                    if(i instanceof Butterbeer){
                        if(butterbeerCount==0){
                            int bbPotion = JOptionPane.showConfirmDialog(null, "Do you want to use the Butterbeer as a potion?", null, JOptionPane.YES_NO_OPTION);
                            if(bbPotion == JOptionPane.YES_OPTION){
                                player.setSpecialPotion(new FoodAdapter((Food)i));
                                System.out.println("[New potion: Elixir of Froth]");
                                System.out.println(i.getDescription()+"\t|\thealing: "+player.getSpecialPotion().getHealing()+"\t|\tstability: "+player.getSpecialPotion().getStability());
                                butterbeerCount = 1;
                            }
                        }else player.eatFood((Food)i);
                    }else{
                        player.eatFood((Food)i);
                    }
                }else if(i instanceof PotionDecorator){
                    if(player.getPotion() == null && player.getSpecialPotion()==null){
                        System.out.println("[No potions found. Acquire a potion to enable enhancers]");
                    }else if(player.getPotion() != null && player.getSpecialPotion()==null){
                        player.addEnhancement(player.getPotion(), (Potion)i);
                        printEnhancement(i);
                        System.out.println(player.getPotionDescription());

                    }else if(player.getPotion() == null && player.getSpecialPotion()!=null){
                        player.addEnhancement(player.getSpecialPotion(), (Potion)i);
                        printEnhancement(i);
                        System.out.println(player.getSpecialPotionDescription());
                    }else if(player.getPotion()!=null&&player.getSpecialPotion()!=null){
                        String[] buttons = {"draught","butterbeer"};
                        int whichPotionEnhance = JOptionPane.showOptionDialog(null, "Select the potion to enhance: ",null,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons[1]);
                        if(whichPotionEnhance == 0){
                            player.addEnhancement(player.getPotion(), (Potion)i);
                            printEnhancement(i);
                            System.out.println(player.getPotionDescription());
                        } else{
                            player.addEnhancement(player.getSpecialPotion(), (Potion)i);
                            printEnhancement(i);
                            System.out.println(player.getSpecialPotionDescription());
                        }
                    }
                }else if(i instanceof Cauldron){
                    System.out.print("[Cauldron exploded... Seamum!!!]");
                    loop=false;
                }
            }
            i = randomItem();
            System.out.println("\n");
        }
        System.out.println("*** Game over: ( ***");
    }

    public static void printEnhancement(Item i){
        System.out.println("[Added enhancement: "+i.getDescription().toLowerCase()+"]");
    }

    public static Item randomItem(){
        Random rand = new Random();
        ArrayList<Item> arr = new ArrayList<>();
        arr.add(new ChocolateFrog());
        arr.add(new BertiesBeans());
        arr.add(new Butterbeer());
        arr.add(new DraughtPotion());
        arr.add(new PowderedUnicornHorn());
        arr.add(new MandrakeRoot());
        arr.add(new PhoenixFeather());
        arr.add(new Cauldron());
        int n = rand.nextInt(arr.size());
        Item result = arr.get(n);
        return result;
    }
}