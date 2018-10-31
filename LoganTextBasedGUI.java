import java.util.*;
public class LoganTextBasedGUI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main theMain = new Main();
        System.out.print("Welcome to kitten project, get started? (y/n): ");
        String response;
        response = in.next();
        if(response.equals("y")) {
            System.out.println("Use a new house or a saved house (type 'new' or 'saved')");
            response = in.next();
            if(response.equals("new") || response.equals("New")) {
                theMain.list(theMain.quiz());
            } else if (response.equals("saved") || response.equals("Saved")) {
                theMain.list(100);
            }
        } else {
            System.out.println("Goodbye.");
        }
        
    }
    
    public int quiz() {
        Scanner in = new Scanner(System.in);
        System.out.println("how many lightbulbs do you have in your home?");
        int lightbulbs = in.nextInt();
        return lightbulbs;
    }
    
    public void list(int lightbulbs) {
        System.out.print("this is a list!!\n You have " + lightbulbs + 
                " Lightbulbs. $5 per bulb. The total cost is $" + lightbulbs * 5 + 
                ". \n The difficulty is 2. \n The energy savings is 3700 Watts/Year");
    }
}
