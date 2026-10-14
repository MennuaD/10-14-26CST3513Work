import java.util.*;

public class TelephoneTester {
    public static void main(String[] args){
        String phoneNumber;     // holds phone num

        Scanner s = new Scanner(System.in);

        System.out.print("Enter an unformatted telephone number: ");
        phoneNumber = s.nextLine();

        System.out.println("Formatted: " + Telephone.format(phoneNumber)); // calls created class format method to format phoneNumber

        System.out.println("Enter a phone number formatted as");        //Mennua Netri Herta Davis
        System.out.print("(XXX)XXX-XXXX : ");
        phoneNumber = s.nextLine();

        System.out.println("Unformatted: " + Telephone.unformat(phoneNumber)); // calls created class unformat method to unformat phoneNumber
    }
}
