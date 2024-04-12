import java.util.*;
import java.util.stream.IntStream;
import java.io.*;


class missingNumber{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of operation you want to perform");
        int t=Integer.parseInt(br.readLine().trim());

        while (t-->0) {
            System.out.println("enter size of array");
            int n=Integer.parseInt(br.readLine().trim());
            System.out.println("enter elements of the array");
            String str[]=br.readLine().trim().split(" ");
            int array[]=new int[n-1];
            for(int i:array){
                array[i]=Integer.parseInt(str[i]);
            }
            Solution1 sln= new Solution1();
            System.out.println(sln.missingnumber(array,n));
        }
    }
}
class Solution1{
    static int missingnumber(int array[], int n){
        

        //ragular operation
        Arrays.sort(array);
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }
        return n;

        //return IntStream.range(0, n-1).filter(i->array[i]!=i+1).findFirst().orElse(n); //ternary operation
   }
}