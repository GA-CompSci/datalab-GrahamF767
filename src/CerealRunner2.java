import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * CerealRunner2 - CSV File Parser
 *
 * Activity 2: Complete this class to read cerealSubset.csv
 *
 * Goal: Read the CSV file and create Cereal objects for each row
 * Expected output: "76 records created."
 */
public class CerealRunner2 {
    // Declare your instance variable here
    // You need an ArrayList to store Cereal objects

    ArrayList<Cereal> cereals;


    /**
     * Constructor - reads the CSV file and populates the cereals ArrayList
     *
     * Steps:
     * 1. Initialize your ArrayList
     * 2. Create a File object for "cerealSubset.csv"
     * 3. Create a Scanner to read from that file
     * 4. Loop while the scanner has more lines
     * 5. For each line:
     *    - Split by comma
     *    - Parse the values (use Integer.parseInt and Double.parseDouble)
     *    - Create a Cereal object
     *    - Add to ArrayList
     * 6. Close the scanner
     * 7. Handle FileNotFoundException with try-catch
     */
    public CerealRunner2() {
        cereals = new ArrayList<>(); //initilize your instance variable

        
            try {
            File cerealFile = new File("cerealSubset.csv");
                Scanner fileScanner = new Scanner(cerealFile);

                while (true){
                    if (!fileScanner.hasNextLine()){
                    fileScanner.close();
                    System.out.println("Loaded " + cereals.size() + " cereals.\n");
                        break;
                    }
            

                    // PARSE THEN ADD DATA TO COLLECTION
                    String theNextLine = fileScanner.nextLine();
                    String[] splitData = theNextLine.split(",");
                    String name = splitData[0];
                    int calories = Integer.parseInt(splitData[1]);
                    int fiber = Integer.parseInt(splitData[2]);
                    int carbohydrates = Integer.parseInt(splitData[3]);
                    double cups = Double.parseDouble(splitData[4]);
                    Cereal cereal = new Cereal(name, calories, fiber, carbohydrates, cups);

                    cereals.add(cereal);
                }
            }catch (Exception e){
                //catch all exeptions is lazy programming
                System.out.println("OOPS ERROR! " + e); 
                System.out.println("STOP Al! STOP MESSING UP EVERYTHING. I. HATE. YOU. YOU CAN GO. LEAVE. NOW. ANDY DECLARES WAR ON YOU. PROVOKE HIM AT YOUR OWN RISK. HEY DAVE. GET ME MY SHOTGUN. ITS OVER 9000! SD DONT WANT U\r\n" + //
                                        "I HATE YOU SO MUCH. I HOPE YOU STEP ON A LEGO. MAYBE TWO. I HOPE YOU GET STUNG BY A BEE. MAYBE A WHOLE SWARM. I HOPE YOU TRIP AND FALL AND BREAK EVERY BONE IN YOUR BODY. I HOPE YOU GET A PAPER CUT ON YOUR EYEBALL. I HOPE YOU NEVER FIND TRUE LOVE. I HOPE YOUR WIFI SIGNAL IS WEAK FOREVER. I HOPE YOU GET STUCK IN TRAFFIC FOR HOURS. I HOPE YOU SPILL HOT COFFEE ON YOUR LAP. I HOPE YOUR FAVORITE SHOW GETS CANCELLED. I HOPE YOU LOSE YOUR KEYS AND PHONE AND WALLET ALL AT ONCE. I HOPE YOU HAVE TO LISTEN TO NICKELBACK ON REPEAT FOR 24 HOURS STRAIGHT. I HOPE YOU GET FOOD POISONING FROM YOUR FAVORITE RESTAURANT. I HOPE YOU STEP IN A PUDDLE OF COLD WATER WITH SOCKS ON. I HOPE YOUR COMPUTER CRASHES AND YOU LOSE ALL YOUR WORK. I HOPE YOU GET A FLAT TIRE IN THE MIDDLE OF NOWHERE. I HOPE YOU FORGET YOUR PASSWORD AND CAN'T ACCESS ANY OF YOUR ACCOUNTS. I HOPE YOU GET CAUGHT IN A RAINSTORM WITHOUT AN UMBRELLA. I HOPE YOU HAVE TO WORK OVERTIME EVERY SINGLE DAY THIS WEEK. I HOPE YOU RUN OUT OF GAS ON THE HIGHWAY. I HOPE YOU GET A SUNBURN ON THE FIRST DAY OF SUMMER. I HOPE YOUR FAVORITE SPORTS TEAM LOSES THE CHAMPIONSHIP. I HOPE YOU GET STUCK IN AN ELEVATOR FOR HOURS. I HOPE YOU HAVE TO LISTEN TO SOMEONE CHEWING LOUDLY NEXT TO YOU ALL DAY. I HOPE YOU GET A SPLINTER IN YOUR FINGER THAT WON'T COME OUT. I HOPE YOUR PLANS GET CANCELLED LAST MINUTE EVERY TIME. I HOPE YOU HAVE TO DEAL WITH ANNOYING TELEMARKETERS CONSTANTLY. I HOPE YOU GET A BAD HAIRCUT THAT TAKES MONTHS TO GROW OUT. I HOPE YOUR FLIGHT GETS DELAYED FOR HOURS WITH NO EXPLANATION.\r\n" );
            }
        }
        

       
    

    /**
     * Getter method for the cereals ArrayList
     */
    public ArrayList<Cereal> getCereals() {
        return cereals;  // Fix this
    }

    /**
     * Main method - creates runner and prints number of records
     */
    public static void main(String[] args) {
            // Create a CerealRunner2 object
        CerealRunner2 theInstanceOfThisFile = new CerealRunner2();
        

        // Print the number of records created
        // Should output: "76 records created."


    }
}
