import java.util.*;
public class strobogram{
    public static boolean strob(String nums)
    {
        int l = 0;
        int r = nums.length()-1;
        while(l<=r)
        {
            char ch1 = nums.charAt(l);
            char ch2 = nums.charAt(r);
            if(ch1=='0'&& ch2=='0'||
               ch1=='1'&& ch2=='1'||
                   ch1=='6'&& ch2=='9'||
                   ch1=='8'&& ch2=='8'||
                   ch1=='9'&& ch2=='6')
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        if(strob(nums))
        {
            System.out.println("Strobogrammatic");
        }
        else
        {
            System.out.println("Not Strobogrammatic");
        }

    }
}