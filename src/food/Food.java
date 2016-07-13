package food;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Noppharat on 7/12/2016.
 */
public class Food {
    Map<String, Object> map = new HashMap<>();

    protected void setFoodType(){
        map.put("Carnivore", "MEATS");
        map.put("Herbivore", "FRUITS OR GRASS");
        map.put("Omnivore", "MEATS AND FRUIT");


    }

    public String getFoodType(String eatingType){
        setFoodType();
        String animalFood =(String) map.get(eatingType);
        return "This animal eat : " + animalFood;
    }
}
