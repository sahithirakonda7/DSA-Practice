import java.util.*;
public class LongestCommonPref{
    public static String pref(String[] strs)
    {
        for(int i=0;i<strs[0].length();i++)
        {
            char ch = strs[0].charAt(i);
        
        for(int j=1;j<strs.length;j++)
        {
            if(i>=strs[j].length()||strs[j].charAt(i)!=ch)
            {
                return strs[0].substring(0,i);
            }
        }
    }
        return strs[0];
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        String arr = pref(s);
        System.out.println(arr);
    }

}