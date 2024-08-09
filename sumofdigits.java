import java.util.*;
class sumofdigits{
    public static void main(String[]args)
    {
        int m,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = scanner.nextInt();
        while(n>0)
        {
           m=n%10;
           sum=sum+m;
           n=n/10;
        }
        System.out.println("Sum is : "+sum);
        
    }
}