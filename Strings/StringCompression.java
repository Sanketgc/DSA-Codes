import java.lang.StringBuilder;

public class StringCompression {

    public static String Compress(StringBuilder str){

        StringBuilder newstr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count > 1){
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaasssbbbbbbccccccccc");
        System.out.println(Compress(str));
    }
}
