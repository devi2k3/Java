import java.util.*;
class swap{
    public static void main(String[] args)
    {
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a = scanner.nextInt();
        System.out.println("Enter the b value:");
        int b = scanner.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("after swap a="+a);
        System.out.println("after swap b="+b);
        

    }
}