package animal;

import food.Food;

/**
 * Created by Noppharat on 7/12/2016.
 */
public class Animals {
    private String animalCode;
    private String animalName;
    private String animalType;//Mammals, Reptiles, Birds, Insects, Spider, Aquatic
    private String eatingType;//Carnivore, Herbivore, Omnivore
    private String BinomialName;

    protected void setAnimalCode(String animalCode){
        this.animalCode = animalCode;
    }

    protected String getAnimalCode(){
        return animalCode;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getEatingType() {
        return eatingType;
    }

    public void setEatingType(String eatingType) {
        this.eatingType = eatingType;
    }

    public String getBinomialName() {
        return BinomialName;
    }

    public void setBinomialName(String binomialName) {
        BinomialName = binomialName;
    }

    protected void eat(Food food){

    }

    protected void sleep(){

    }

}
