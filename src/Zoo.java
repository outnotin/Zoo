import animal.Tiger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        feesType.put("thai,adult","Thai adult : 100 Baht/person");
        feesType.put("thai,university","Thai university : 50 Baht/person");
        feesType.put("thai,student","Thai student 20 Baht/person");
        feesType.put("thai,government","Thai government : 50 Baht/person");
        feesType.put("thai,other","Thai elder, disable, monk : Free");
        feesType.put("foreign,adult","Foreign adult : 150 Baht/person");
        feesType.put("foreign,child","Foreign child : 70 Baht/person");
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
    }

    public String selectFeesRates(String nationality, String type){
        String feeTypes;
        feeTypes = nationality + "," + type;
        return feeTypes;
    }

    public void menu(){
        Scanner scan = new Scanner(System.in);
        String command, nationality, type;
        System.out.println("Please enter the command");
        System.out.println(" - zooinfo : Get information of the zoo.");
        System.out.println(" - fees : Get fees rates.");
        command = scan.next();

        if(command.equals("zooinfo")){
            System.out.println("----------------------------------");
            System.out.println("Name : " + getZooName());
            System.out.println("Location : " + getZooLocation());
            System.out.println(getOfficeHour());
            System.out.println("----------------------------------");
            menu();
        }else if(command.equals("fees")){
            System.out.println("Please enter you nationality,type. ex. thai,adult");
            System.out.println(" - thai : Thai nationality");
            System.out.println("    - adult : Age more than 15.");
            System.out.println("    - university : University ID card needed.");
            System.out.println("    - student : Student ID card needed.");
            System.out.println("    - government : Government ID card needed.");
            System.out.println("    - other : Elder, Disable or Monk.");
            System.out.println(" - foreign : Other nationality");
            System.out.println("    - adult : Age more than or equals to 15.");
            System.out.println("    - child : Age less than 15.");
            nationality = scan.next();
            System.out.println(getFees(nationality));
            System.out.println("------------------------------------");
            menu();
        }else{
            System.out.println("You have enter the wrong command.");
        }

    }

    public static void main(String [] args){

        Zoo zoo = new Zoo();
        zoo.setDefault();
        //zoo.menu();

        Tiger t1 = new Tiger();
        t1.eat();

    }

}
