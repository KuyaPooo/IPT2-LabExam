import java.util.*;

public class octatohex{

public static void octatohex(Scanner scan)
    {
        String octnum, hexnum;
        int decnum;
		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextLine();
        String orig = octnum;
        
        decnum = Integer.parseInt(octnum, 8);
        hexnum = Integer.toHexString(decnum);
		
        System.out.print("Equivalent Hexadecimal Value of " + orig + " is : "+hexnum);
    }
}