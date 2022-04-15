import java.io.*;
import java.util.*;
 
class Solution{
    
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int small = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large ){
            small =large;
             large = arr[i];
             
            }
            else {
                if( arr[i] <large && arr[i]> small )
                    small = arr[i];
            }
        }
        
        if(small == Integer.MIN_VALUE)
            small =-1;
            
        ArrayList<Integer> al = new ArrayList<Integer>(2);
        
        al.add(large);
        al.add(small);
        
    return al;
    }
}

class Array {
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		}
	}
} 
