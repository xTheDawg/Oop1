package Basics;
import java.io.File;
import java.util.Scanner;
public class GridWalkerTest {

	public static void main(String[] args) {
		int steps;
		String direction;
		GridWalker walkerz = new GridWalker();
        System.out.print("Enter the file name with extension : ");
        
        try {
        Scanner inputF = new Scanner(System.in);

        File file = new File(inputF.nextLine());

        Scanner input = new Scanner(file);
        inputF.close();

        while (input.hasNextLine()) {
        	direction = input.next();
        	steps = input.nextInt();
        	if(direction.equalsIgnoreCase("hoch")) {
        		walkerz.walkUp(steps);
        	}else if(direction.equalsIgnoreCase("runter")) {
        		walkerz.walkDown(steps);
        	}else if(direction.equalsIgnoreCase("rechts")) {
        		walkerz.walkRight(steps);
        	}else if(direction.equalsIgnoreCase("links")) {
        		walkerz.walkLeft(steps);
        	}else {
        		System.err.println("Bad Input. Exiting programm..");
        		System.exit(1);
        	}
        }
        System.out.println("Your position is: " + walkerz.toString());
        input.close();
        }catch(Exception x) {
        	System.err.println(x.getMessage());
        }
		
		/*GridWalker walker1 = new GridWalker();
		walker1.walkDown(5); // 0/-5
		walker1.walkRight(3); // 3/-5
		walker1.walkLeft(4); // -1/-5
		walker1.walkUp(8); // -1/3
		System.out.println("Your position is: " + walker1.toString());
		
		GridWalker walker2 = new GridWalker(-5, 15);
		walker2.walkDown(10); // -5/5
		walker2.walkRight(6); // 1/5
		System.out.println("Your position is: " + walker2.toString());*/
	}
}
