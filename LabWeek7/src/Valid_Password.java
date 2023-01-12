import java.util.*;

public class Valid_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String curr;
        // int to keep track of count
        int i=1;
        while(true){
            curr = sc.next();
            if(curr.equals("#"))
                break;
            if(isValid(curr))
                System.out.println("Case #"+i+": valid");
            else
                System.out.println("Case #"+i+": invalid"); 
            i++;
        }

    }
    // a function to check if password is valid
    public static boolean isValid(String currentWord){
        // Password MUST BE at least 6 characters.
        if(currentWord.length()<6)
            return false;
        // Password CAN HAVE a combination of 
        // small letters(‘a’-‘z’) and digit (‘0’-‘9’) only.
        char[] ch = currentWord.toCharArray();
        for(char c:ch){
            if(Character.isUpperCase(c))
                return false;
            if(!Character.isLetterOrDigit(c)) 
                return false;
        }
        return true;
    }
}