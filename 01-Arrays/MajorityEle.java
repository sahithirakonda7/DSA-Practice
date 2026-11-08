import java.util.Scanner;
class MajorityEle{
    static int maj(int arr[],int n){
        //  n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>n/2)
            {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]  = sc.nextInt();
        }
        int result = maj(arr, n);
        System.out.println(result);
    }
}