import animal.Animals;
import animal.Giraffe;
import animal.SouthernFlyingSquirrel;
import animal.Tiger;
import com.sun.xml.internal.ws.util.HandlerAnnotationInfo;
import sun.security.krb5.internal.TicketFlags;

import java.util.*;

/**
 * Created by Noppharat on 7/12/2016.
 */
public class Zoo {
    private String zooName;
    private String zooType; //safari park, aquaria, roadside zoos, petting zoos, animal theme park
    private String zooLocation;
    private String fees;
    private String officeHour;

    Map<String, Object> feesType = new HashMap<>();
    List<Animals> animalsList = new ArrayList<>();

    Tiger t1 = new Tiger();
    Tiger t2 = new Tiger();
    Giraffe g1 = new Giraffe();
    SouthernFlyingSquirrel sq1 = new SouthernFlyingSquirrel();

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public String getZooType() {
        return zooType;
    }

    public void setZooType(String zooType) {
        this.zooType = zooType;
    }

    public String getZooLocation() {
        return zooLocation;
    }

    public void setZooLocation(String zooLocation) {
        this.zooLocation = zooLocation;
    }

    public String getFees(String feesType) {
        fees = (String) this.feesType.get(feesType);
        return fees;
    }

    public void setFees() {
        feesType.put("thai","Thai adult : 100 Baht/person\nThai university : 50 Baht/person\nThai student : 20 Baht/person\nThai government : 50 Baht/person\nThai elder, disable, monk : Free");
        feesType.put("foreign","Foreign adult : 150 Baht/person\nForeign child : 70 Baht/person");
        feesType.put("parking", "Motorcycle : 10 Baht\nCar : 50 Baht\nBus : 60 Baht");
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setDefault(){
        setZooName("Dusit Zoo");
        setZooLocation("Bangkok, Thailand");
        setOfficeHour("Open Daily : 8:00 AM - 06:00 PM");
        setFees();
        setZooType("Animal Theme Park");

//       -----------------Set Animal Default---------------------

        t1.setAnimalCode("t1");
        t1.setAnimalGender("Male");

        t2.setAnimalCode("t2");
        t2.setAnimalGender("Female");

        g1.setAnimalCode("g1");
        g1.setAnimalGender("Male");

        sq1.setAnimalCode("sq1");
        sq1.setAnimalGender("Female");

        animalsList.add(t1);
        animalsList.add(t2);
        animalsList.add(g1);
        animalsList.add(sq1);

    }

    public String selectFeesRates(String nationality, String type){
        String feeTypes;
        feeTypes = nationality + "," + type;
        return feeTypes;
    }

    public void menu(){
        Scanner scan = new Scanner(System.in);
        String command, type;
        System.out.println("Please enter the command");
        System.out.println(" - zooinfo : Get information of the zoo.");
        System.out.println(" - fees : Get fees rates.");
        System.out.println(" - animal : Get animals information.");
        System.out.println(" - exit : Terminate the program.");
        command = scan.next();

        if(command.equals("zooinfo")){
            System.out.println("----------------------------------");
            System.out.println("Name : " + getZooName());
            System.out.println("Location : " + getZooLocation());
            System.out.println(getOfficeHour());
            System.out.println("----------------------------------");
            menu();
        }else if(command.equals("fees")){
            System.out.println("Please enter fees type.");
            System.out.println(" - thai : Thai nationality");
            System.out.println(" - foreign : Other nationality");
            System.out.println(" - parking : Parking fees");
            type = scan.next();
            if(type.equals("thai") || type.equals("foreign") || type.equals("parking")){
                System.out.println(getFees(type));
                System.out.println("------------------------------------");

            }else{
                System.out.println("Unknown command.");
            }

            menu();
        }else if (command.equals("animal")){
            for(Animals anl : animalsList){
                anl.showInfo();
            }
            menu();
        }else if(command.equals("exit")){
            System.out.println("Exit.");
            System.exit(0);
        }else{
            System.out.println("You have enter the wrong command.");
            menu();
        }

    }

    public static void main(String [] args){

        Zoo zoo = new Zoo();
        zoo.setDefault();
        zoo.menu();


    }

}
