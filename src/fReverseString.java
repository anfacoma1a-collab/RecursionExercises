public class fReverseString {

    public static String reverseString(String text){

        if(text.length() <= 1){
            return text;

        }
        return reverseString(text.substring(2)) +  text.charAt(1) + text.charAt(0);
    }


}
