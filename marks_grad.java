import java.util.*;

class mark_grad{
    public static void main(String arg[]){
        int mark;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Marks");
        mark=sc.nextInt();
        if(mark>90){
            System.out.println("Grad A");
        }else if(mark>80){
            System.out.println("Grad B");
        }else if(mark>70){
            System.out.println("Grad C");
        }else if(mark>60){
            System.out.println("Grad D");
        }else if(mark>40){
            System.out.println("Grad E");
        }else if(mark<=40){
            System.out.println("Grad Fail");
        }
    }
}
