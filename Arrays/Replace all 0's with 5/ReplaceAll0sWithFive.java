// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        
        // int rev=0;
        // while(num>=0)
        // {
        //     int s = num%10;
        //     if(s!=0)
        //         rev = rev*10+s;
        //     else
        //         rev = rev*10+5;
        //     num = num/10;
        // }
        
        // int convertoffive=0;
        // while(rev>=0)
        // {
        //     int ele = rev%10;
        //     convertoffive = convertoffive *10+ele;
        //     rev = rev/10;
        // }
        // return convertoffive;
        
        int i=0,sum=0;
        while(n!=0){
            int digit=n%10;
        if(digit==0){
            digit=5;
        }
        sum+=digit*Math.pow(10,i);
        i++;
        n=n/10;
    }
   return sum;
        
        
    }
    
}
