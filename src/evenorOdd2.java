import java.util.*;
import java.lang.*;




public class evenorOdd2 {
    public static boolean isEven(String s1){
        int l = s1.length();
        char[] s = s1.toCharArray();

        boolean dotSeen = false;
        for(int i = l-1;i>=0;i--){
            if(s[i] == '0' && dotSeen ==false)
                continue;

            if (s[i] == '.'){
                dotSeen =true;
                continue;
            }

            if((s[i] - '0')% 2 ==0)
                return true;

            return false;

        }
        return false;
    }

    public static void main(String[] args) {
        String s= "100.61";
        if(isEven(s))
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
