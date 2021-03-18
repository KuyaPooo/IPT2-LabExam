public static void bintodec(Scanner scan){
        int binnum, decnum=0, i=1, rem;
		
        System.out.print("Enter Binary Number : ");
        binnum = scan.nextInt();
        int temp = binnum;
		
        // converting the number into decimal format
        while(binnum != 0)
        {
            rem = binnum%10;
            decnum = decnum + rem*i;
            i = i*2;
            binnum = binnum/10;
        }
		
        System.out.print("Equivalent Decimal Value of " +temp+ " is : "+ decnum);

    }



