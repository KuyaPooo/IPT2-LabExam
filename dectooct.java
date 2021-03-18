import java.util.*;

public class dectooct{

public static void dectooct(Scanner scan){
        int decnum, rem, quot, i=1, j;
        int octnum[] = new int[100];
		
        System.out.print("Enter any Decimal Number : ");
        decnum = scan.nextInt();
	rem = decnum;
        quot = decnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Equivalent Octal Value of " + rem + " is : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.println();
    }
}