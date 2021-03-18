

import java.util.*;

public class hexatoocta {
    
    public static int hex2decimal(String s){
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void hextoocta(Scanner scan){
        String hexdecnum;
        int decnum, i=1, j;
        int octnum[] = new int[100];
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdecnum = scan.nextLine();
        String temp = hexdecnum;
        // first convert hexadecimal to decimal
        
        decnum = hex2decimal(hexdecnum);
        
        // now convert decimal to octal
        
        while(decnum != 0)
        {
            octnum[i++] = decnum%8;
            decnum = decnum/8;
        }
		
        System.out.print("Equivalent Octal Number of "+ temp +" is : ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.println();
    }
    
}

