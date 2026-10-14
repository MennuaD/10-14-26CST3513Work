public class Social {

    public final static int FORMATTED_LENGTH = 11; //valid formatted length of social
    public final static int UNFORMATTED_LENGTH = 9; // valid unformatted length of social

    public static boolean isFormatted(String str){ // determines whether the given string
        boolean valid; // flag                     // is in valid social security format

        if(str.length() == FORMATTED_LENGTH && str.charAt(3) == '-' &&
                str.charAt(6) == '-') { //determines if string is formatted
            valid = true;
        }else {
            valid = false;
        }
        return valid;                                   //Mennua Netri Herta Davis
    }


    public static String unformat(String str){          // Takes a formated string (social#)
        StringBuilder strb = new StringBuilder(str);    // and if it actually is formatted, returns it unformatted,
        // otherwise returns original
        if(isFormatted(str)){ // only if formatted
            strb.deleteCharAt(3); // first hyphen
            strb.deleteCharAt(5); // second hyphen
        }

        return strb.toString();
    }

    public static String format(String str){
        StringBuilder strb = new StringBuilder(str);

        if(str.length() == UNFORMATTED_LENGTH){ // only if of unformatted length
            strb.insert(3, "-"); // add first hyphen
            strb.insert(6, "-"); // add second hyphen
        }
        return strb.toString();
    }
}
