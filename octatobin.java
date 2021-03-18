
import java.util.*;


public class octatobin {
    
    public static void octatobin(Scanner scan){
        int octnum, rem, i=1, j ,temp;
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        int binnum = 0;
		
        System.out.print("Enter Octal Number : ");
        octnum = scan.nextInt();
	temp = octnum;

	while (temp != 0)	
        {
        rem = (int)(temp % 10);
        binnum = octal_numvalues[rem] * i + binnum;
        temp /= 10;
        i *= 1000;
        }
		
        System.out.println("Equivalent Binary Value of " +octnum+ " is : "+ binnum);
        

    }
    
}

