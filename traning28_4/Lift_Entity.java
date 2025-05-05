package traning28_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lift_Entity extends Lift{
	Scanner in = new Scanner(System.in);
	 int no_lifts; 
	 int l_no,num;
	    
	 Lift[] lifts;
	 
	 void get_Floor() {
    	
    	System.out.print("Enter number of lifts: ");
        no_lifts = in.nextInt();  
        
        lifts = new Lift[no_lifts];  
        
        for (int j = 0; j < no_lifts; j++) {
            lifts[j] = new Lift(); 
        }
    	
        boolean flag = true;  

        while (flag) {
            System.out.println("Enter floor number or type \"stop\" to stop: or \"random\" for ramdom floor:  ");
            String input = in.next();
            
            if (input.equalsIgnoreCase("stop")) {
                flag = false;  
            } 
            else if(input.equalsIgnoreCase("random")) {
            	System.out.print("Enter lift number (1 to " + no_lifts + "): ");
                l_no = in.nextInt();  
      
                lifts[l_no - 1].move(lifts[l_no - 1]);
            }
            else {
                try {
                    num = Integer.parseInt(input);  
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid floor number.");
                    continue;  
                }
                System.out.print("Enter lift number (1 to " + no_lifts + "): ");
                l_no = in.nextInt();  
                
             
                if (l_no < 1 || l_no > no_lifts) {
                    System.out.println("Invalid lift number! Please enter a valid lift number.");
                    continue;  
                }
                lifts[l_no - 1].move(lifts[l_no - 1], num);
            } 
        }
        System.out.println("Process Stopped");
        System.out.println("Press \"y\" to see history of a lifrt");
    }
	
}
