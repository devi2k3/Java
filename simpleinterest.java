import java.util.*;
import java.io.*;
class simpleinterest{
    public static void main(String[] args){
        float p,t,r,si;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principle :");
        p = scanner.nextInt();
        System.out.println("Enter Time:");
        t = scanner.nextInt();
        System.out.println("Enter Rate:");
        r = scanner.nextInt();
        si=(p*t*r)/100;
        System.out.println("Simple Interest is :"+si);
        
    }
}