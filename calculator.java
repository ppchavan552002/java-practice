import java.util.*;
class calculator{
    public static void main(String arg[]){
        int a, b;
        String op;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two Number");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter opertion which you wnat to perform like +/-*");
        op=sc.next();
        switch (op) {
            case "+":
                a +=b;
                System.out.println("addition of number: " + a);
                break;
            case "-":
                a -=b;
                System.out.println("addition of number: " + a);
                break;
            case "*":
                a *=b;
                System.out.println("addition of number: " + a);
                break;
            case "/":
                a /=b;
                System.out.println("addition of number: " + a);
                break;
            
            default:
                System.out.println("wrong sign");
                break;
        }
    }
}