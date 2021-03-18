import java.util.*;

public class dectohex{

public static void dectohex(Scanner scan)
    {
        int decnum, rem;
        String hexdecnum="";
        
        // digits in hexadecimal number system
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

		
        System.out.print("Enter Decimal Number : ");
        decnum = scan.nextInt();
        int temp = decnum;
        // converting the number in hexadecimal format
        while(decnum>0)
        {
            rem = decnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            decnum = decnum/16;
        }
		
        System.out.print("Equivalent Hexadecimal Value of " +temp+ " is : ");
        System.out.println(hexdecnum);
            
    }
}