import.java.util.*;
public class dectobin
public static void dectobin(Scanner scan){
        int decnum, rem, quot, i=1, j;
        int binnum[] = new int[100];
		
        System.out.print("Enter any Decimal Number : ");
        decnum = scan.nextInt();
        rem = decnum;
        quot = decnum;
		
        while(quot != 0)
        {
            binnum[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Equivalent Binary Value of " + rem + " is : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }
        System.out.println();
    }
}