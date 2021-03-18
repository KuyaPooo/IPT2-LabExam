
import java.util.*;


public class Exam {
    
    // convertion of binary
        static bintodec b2d = new bintodec();
        static bintohex b2h = new bintohex();
        static bintooct b2o = new bintooct();
        
        // convertion of decimal
        static dectobin d2b = new dectobin();
        static dectohex d2h = new dectohex();
        static dectooct d2o = new dectooct();
        
        // convertion of hexadecimal
        static hextobin h2b = new hextobin();
        static hextodec h2d = new hextodec();
        static hextoocta h2o = new hextoocta();
        
        // convertion of octal
        static octatobin o2b = new octatobin();
        static octatodec o2d = new octatodec();
        static octatohex o2h = new octatohex();
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        startup();
        options(sc);
        
        
    }
    
    //start up
    static void options(Scanner sc){
        
        int input;
        
        
        System.out.println(" \n--------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|               OPTIONS                |");
        System.out.println("|     BINARY[1]         DECIMAL[2]     |");
        System.out.println("|     HEXADECIMAL[3]    OCTAL[4]       |");
        System.out.println("|     EXIT[0]                          |");
        System.out.println("|                                      |");
        System.out.println(" --------------------------------------\n");
        
        
        System.out.print("Enter the type of number you want to convert: ");
        input = sc.nextInt();
        
        switch(input){
            case 0:
                System.exit(0);
                break;
            case 1,2,3,4:
                option2(sc, input);
                break;
            default:
                System.out.println("Invalid Entry! Try Again. ");
                options(sc);
                break;
        }
    }
    static void startup(){
        System.out.println(" --------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|        NUMBER CONVERTER 2000         |");
        System.out.println("|                                      |");
        System.out.println("|  CONVERTS NUMBERS TO DESIRED OUTPUT  |");
        System.out.println("|                                      |");
    }
    static void option2(Scanner sc, int i){
        
        int input;
        System.out.println(" \n--------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|               OPTIONS                |");
        System.out.println("|     BINARY[1]         DECIMAL[2]     |");
        System.out.println("|     HEXADECIMAL[3]    OCTAL[4]       |");
        System.out.println("|     EXIT[0]           BACK[5]        |");
        System.out.println("|                                      |");
        System.out.println(" --------------------------------------\n");
        
        
        System.out.print("Enter the type of number you want it to convert in to: ");
        input = sc.nextInt();
        
        switch(input){
            case 0:
                System.exit(0);
                break;
            
            case 1:
                if(i == 1){
                    System.out.println("Invalid Entry! Try Again. ");
                    option2(sc, i);
                }else if(i == 2){
                    System.out.println(" --------------------------------------");
                    System.out.println("|     CONVERTING DECIMAL TO BINARY     |");
                    System.out.println(" --------------------------------------");
                    d2b.dectobin(sc);
                }else if(i==3){
                    System.out.println(" --------------------------------------");
                    System.out.println("|   CONVERTING HEXADECIMAL TO BINARY   |");
                    System.out.println(" --------------------------------------");
                    h2b.hextobin(sc);
                }else{
                    System.out.println(" --------------------------------------");
                    System.out.println("|      CONVERTING OCTAL TO BINARY      |");
                    System.out.println(" --------------------------------------");
                    o2b.octatobin(sc);
                }
                break;
            
            case 2:
                if(i == 1){
                    System.out.println(" --------------------------------------");
                    System.out.println("|     CONVERTING BINARY TO DECIMAL     |");
                    System.out.println(" --------------------------------------");
                    b2d.bintodec(sc);
                }else if(i == 2){
                    System.out.println("Invalid Entry! Try Again. ");
                    option2(sc, i);
                }else if(i==3){
                    System.out.println(" --------------------------------------");
                    System.out.println("|   CONVERTING HEXADECIMAL TO DECIMAL  |");
                    System.out.println(" --------------------------------------");
                    h2d.hextodec(sc);
                }else{
                    System.out.println(" --------------------------------------");
                    System.out.println("|     CONVERTING OCTAL TO DECIMAL     |");
                    System.out.println(" --------------------------------------");
                    o2d.octatodec(sc);
                }
                break;
            
            case 3:
                if(i == 1){
                    System.out.println(" --------------------------------------");
                    System.out.println("|   CONVERTING BINARY TO HEXADECIMAL   |");
                    System.out.println(" --------------------------------------");
                    b2h.bintohex(sc);
                }else if(i == 2){
                    System.out.println(" --------------------------------------");
                    System.out.println("|  CONVERTING DECIMAL TO HEXADECIMAL   |");
                    System.out.println(" --------------------------------------");
                    d2h.dectohex(sc);
                }else if(i==3){
                    System.out.println("Invalid Entry! Try Again. ");
                    option2(sc, i);
                }else{
                    System.out.println(" --------------------------------------");
                    System.out.println("|   CONVERTING OCTAL TO HEXADECIMAL    |");
                    System.out.println(" --------------------------------------");
                    o2h.octatohex(sc);
                }
                break;
                
            case 4:
                if(i == 1){
                    System.out.println(" --------------------------------------");
                    System.out.println("|      CONVERTING BINARY TO OCTAL      |");
                    System.out.println(" --------------------------------------");
                    b2o.bintoocta(sc);
                }else if(i == 2){
                    System.out.println(" --------------------------------------");
                    System.out.println("|     CONVERTING DECIMAL TO OCTAL     |");
                    System.out.println(" --------------------------------------");
                    d2o.dectooct(sc);
                }else if(i==3){
                    System.out.println(" --------------------------------------");
                    System.out.println("|    CONVERTING HEXADECIMAL TO OCTAL   |");
                    System.out.println(" --------------------------------------");
                    h2o.hextoocta(sc);
                }else{
                    System.out.println("Invalid Entry! Try Again. ");
                    option2(sc, i);
                }
                break;
                
            case 5:
                options(sc);
                break;
                
            default:
                System.out.println("Invalid Entry! Try Again. ");
                option2(sc, i);
                break;
        }
        tryagain(sc);
        
    }
    static void tryagain(Scanner sc){
        int input;
        System.out.print("\nDo you wanna Convert again? (YES[1] NO[0]): ");
        input = sc.nextInt();
        switch (input){
            case 1:
                options(sc);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                 System.out.println("Invalid Entry! Try Again. ");
                tryagain(sc);
                break;
        }
    }
    
}

