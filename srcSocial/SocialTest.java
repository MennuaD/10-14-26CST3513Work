import java.util.*;

public class SocialTest {
    public static void main(String[] args){
        String socialNum;     // holds social security num

        Scanner s = new Scanner(System.in);

        System.out.print("Enter an unformatted social security number: ");
        socialNum = s.nextLine();

        System.out.println("Formatted: " + Social.format(socialNum)); // calls created class format method to format socialNum

        System.out.println("Enter a social security number formatted as"); //Mennua Netri Herta Davis
        System.out.print("XXX-XX-XXXX : ");
        socialNum = s.nextLine();

        System.out.println("Unformatted: " + Social.unformat(socialNum)); // calls created class unformat method to unformat socialNum
    }
}
