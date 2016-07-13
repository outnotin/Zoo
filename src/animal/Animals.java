package animal;

import food.Food;

/**
 * Created by Noppharat on 7/12/2016.
 */
public class Animals {
    private String animalCode;
    private String animalName;//Tiger, Lion, etc.
    private String animalGender;
    private String animalType;//Mammals, Reptiles, Birds, Insects, Spider, Aquatic
    private String eatingType;//Carnivore, Herbivore, Omnivore
    private String BinomialName;

    public String getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(String animalGender) {
        this.animalGender = animalGender;
    }

    public void setAnimalCode(String animalCode){
        this.animalCode = animalCode;
    }

    public String getAnimalCode(){
        return animalCode;
    }

    public String getAnimalName() {
        return animalName;
    }

    protected void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    protected void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getEatingType() {
        return eatingType;
    }

    protected void setEatingType(String eatingType) {
        this.eatingType = eatingType;
    }

    public String getBinomialName() {
        return BinomialName;
    }

    protected void setBinomialName(String binomialName) {
        BinomialName = binomialName;
    }

    public String eat(){
        Food food = new Food();
        return food.getFoodType(eatingType);
    }

    public void showInfo(){
        System.out.println("Code : " + getAnimalCode());
        System.out.println("Gender : " + getAnimalGender());
        System.out.println("Name : " + getAnimalName());
        System.out.println("Binomial name : " + getBinomialName());
        System.out.println("Class : " + getAnimalType());
        System.out.println("Order : " + getEatingType());
        System.out.println(eat());
        System.out.println("--------------------------------------");

    }

    protected void sleep(){

    }

}
