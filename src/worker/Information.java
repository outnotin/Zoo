package worker;

/**
 * Created by Noppharat on 7/13/2016.
 */
public class Information extends Worker implements Working {
    private String buildingZone;

    @Override
    public void doingDuty(String command) {
        switch (command){
            case "tellinfo" :
                System.out.println("Information start telling info.");
                tellingZooInfo();
            case "announce":
                System.out.println("Information start announcing.");
                annoucing();
                default:
                    System.out.println("Information is not doing anythins.");
        }
    }

    protected void tellingZooInfo(){

    }

    protected void annoucing(){

    }

    public String getBuildingZone() {
        return buildingZone;
    }

    public void setBuildingZone(String buildingZone) {
        this.buildingZone = buildingZone;
    }
}
