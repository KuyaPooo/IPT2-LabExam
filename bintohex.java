import java.util.*;

public class bintohex {
    
    public static int bin2dec(int j){
        
        int binnum = j, decnum=0, i=1, rem;
		
		
        // converting the number into decimal format
        while(binnum != 0)
        {
            rem = binnum%10;
            decnum = decnum + rem*i;
            i = i*2;
            binnum = binnum/10;
        }
		
        return decnum;
    }
    
    public static void bintohex(Scanner scan){
        int binnum, rem, temp;
        String hexdecnum="";
        
        // digits in hexadecimal number system
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
        System.out.print("Enter Binary Number : ");
        binnum = scan.nextInt();
        temp = binnum;
        // converting bin to decimal
        binnum = bin2dec(binnum);
        
        
        // converting the number in hexadecimal format
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            binnum = binnum/16;
        }
		
        System.out.print("Equivalent Hexadecimal Value of " +temp+ " is : " + hexdecnum);
            
    }
    
}