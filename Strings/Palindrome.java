import java.util.*;
public class Palindrome{
    public static boolean check(String s){
        int l=0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l)))
            {
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r)))
            {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }       
    }
}