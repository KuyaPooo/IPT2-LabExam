import java.util.*;

public class octatodec{

public static void octatodec(Scanner scan){
        int octnum, decnum=0, i=0, orig;

		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextInt();
        orig = octnum;
		
        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, i);
            i++;
            octnum = octnum/10;
        }
		
        System.out.println("Equivalent Decimal Value of " + orig + " is : "+decnum);

    }
}