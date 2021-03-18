import.java.util.*;
public class bintooct

public static void bintoocta(Scanner scan){
        
        int binnum, octanum = 0, temp, decimalNumber = 0, i = 0;
        
        System.out.print("Enter Binary Number : ");
        binnum = scan.nextInt();
        temp = binnum;
        
       

        while(binnum != 0)
        {
            decimalNumber += (binnum % 10) * Math.pow(2, i);
            ++i;
            binnum /= 10;
        }

        i = 1;

        while (decimalNumber != 0)
        {
            octanum += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        
        System.out.println("Equivalent Octal Value of " + temp + " is : " + octanum);

    
    }
}