import java.util.*;
class HappyIter{
    static int happy(int n)
    {
        if (n==0)
        {
            return 0;
        }
        int digit = n%10;
        return (digit*digit) + happy(n/10);
        
    }
    static boolean is(int n)
    {
        if(happy(n)==1)
    {
        return true;
    }
    if(happy(n)==4)
    {
        return false;
    }
    return (is(happy(n)));
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(is(happy(n)));
    }
}
