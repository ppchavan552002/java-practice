import java.util.*;
import java.util.stream.IntStream;
import java.io.*;
import java.lang.*;
class Search_no_array{
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of iterations");
        int t=Integer.parseInt(read.readLine());
        while (t-->0) {
            System.out.println("Enter size of Array");
            int sizeOfArray=Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];

            System.out.println("Enter element of array");
            String st[]=read.readLine().trim().split("\\s+");
            for(int i=0;i<sizeOfArray;i++){
                arr[i]=Integer.parseInt(st[i]);
            }
                System.out.println("Enter Which Number you want to find");
            int x=Integer.parseInt(read.readLine());
            Solution obj= new Solution();
            System.out.println(obj.search(arr, sizeOfArray, x));
        }

    }
}

class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        // for(int i=0;i<N;i++){
        //     if(arr[i]==X){
        //         return i;
        //     }else if(i+1==N){
        //         return -1;
        //     }
        // }
        
        //ternary opertion
        int result = IntStream.range(0, N).filter(i -> arr[i] == X).findFirst().orElse(-1);
        return result;
        
    }
    
}
