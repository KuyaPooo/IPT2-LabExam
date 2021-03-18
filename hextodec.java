import java.util.*;

public class hextodec {
    
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
    
    public static void hextodec(Scanner scan){
        String hexdecnum;
        int decnum;
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdecnum = scan.nextLine();
        String temp = hexdecnum;
		
        decnum = hex2decimal(hexdecnum);
		
        System.out.println("Equivalent Decimal Number of "+ temp +" is " + decnum);
    }
    
}