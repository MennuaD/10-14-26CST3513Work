public class Telephone {

    public final static int FORMATTED_LENGTH = 13; //valid formatted length
    public final static int UNFORMATTED_LENGTH = 10; // valid unformatted length

    public static boolean isFormatted(String str){ // determines whether the given string
        boolean valid; // flag                     // is in valid US phone# format

        if(str.length() == FORMATTED_LENGTH && str.charAt(0) == '(' &&
        str.charAt(4) == ')' && str.charAt(8) == '-') { //determines if string is formatted
            valid = true;
        }else {
            valid = false;
        }
        return valid;                                   //Mennua Netri Herta Davis
    }


    public static String unformat(String str){          // Takes a formated string (telephone#)
        StringBuilder strb = new StringBuilder(str);    // and if it actually is formatted, returns it unformatted,
                                                        // otherwise returns original
        if(isFormatted(str)){ // only if formatted
            strb.deleteCharAt(0); // left paren
            strb.deleteCharAt(3); // right paren
            strb.deleteCharAt(6); // hyphen
        }

        return strb.toString();
    }

    public static String format(String str){
        StringBuilder strb = new StringBuilder(str);

        if(str.length() == UNFORMATTED_LENGTH){ // only if of unformatted length
            strb.insert(0, "(");
            strb.insert(4, ")");
            strb.insert(8, "-");
        }
        return strb.toString();
    }
}