package carlysmotto;

import java.util.Scanner;
public class CarlysMotto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("*** Carly's makes the food that makes it a party ***");
        System.out.println("Price Per Guest: $35.0 ");
        
        int GuestNumber;
        System.out.println("Please Enter Number of Guest");
        GuestNumber = input.nextInt();
             
        double PricePerGuest = 35.0;
        double TotalPrice = GuestNumber * PricePerGuest;
        boolean LargeGuest = true;
        
        System.out.println("Total Price: "+ "($) " + TotalPrice +" "+ "LargeGuest: " + LargeGuest);
        
        
        
        
    }
    
}
