package worker;

/**
 * Created by Noppharat on 7/13/2016.
 */
public class Zookeeper extends Worker implements Working {
    private String buildingZone;
    @Override
    public void doingDuty(String command) {
        switch (command){
            case "clean":
                System.out.println("Zookeeper start cleaning the animal");
                cleaningAnimal();
            case "feed":
                System.out.println("Zookeeper start feeding the animal");
                feedingAnimal();
            case "train":
                System.out.println("Zookeeper start training the animal");
                trainingAnimal();
                default:
                    System.out.println("Zookeeper is not doing anything.");
        }
    }

    protected void cleaningAnimal(){

    }

    protected void feedingAnimal(){

    }

    protected void trainingAnimal(){

    }

    public String getBuildingZone() {
        return buildingZone;
    }

    public void setBuildingZone(String buildingZone) {
        this.buildingZone = buildingZone;
    }
}
