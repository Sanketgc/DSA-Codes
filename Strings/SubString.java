public class SubString {

    public static String Getsubstring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    // public static String Getsubstring(String str){
    // String substr = "";
    // for(int i=0; i<str.length(); i++){
    // for(int j=i+1; j<str.length(); j++){
    // substr += str.charAt(i) + str.substring(j);

    // }
    // }
    // return substr;
    // }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        // System.out.println(Getsubstring(str,3,6));
    }
}
